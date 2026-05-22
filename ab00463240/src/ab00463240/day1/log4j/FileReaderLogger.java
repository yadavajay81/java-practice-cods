package ab00463240.day1.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileReaderLogger {

    // Create logger instance
    private static final Logger logger = Logger.getLogger(FileReaderLogger.class);

    public static void main(String[] args) {
        // Configure Log4j using properties file
        PropertyConfigurator.configure("log4j.properties");

        FileReaderLogger reader = new FileReaderLogger();
        System.out.println("=== File Processing Logger (Log4j 1.2.17) ===");

        reader.readFile("sample.txt");
        reader.readFile("empty.txt");
        reader.readFile("missing.txt");

        System.out.println("\n✅ Check console and file_processing.log for output logs.");
    }

    public void readFile(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            logger.error("❌ File not found: " + filePath);
            return;
        }

        logger.info("Starting to read file: " + filePath);
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isEmpty = true;

            while ((line = br.readLine()) != null) {
                isEmpty = false;
                lineCount++;
                logger.debug("Line " + lineCount + ": " + line);
            }

            if (isEmpty) {
                logger.warn("⚠️ File '" + filePath + "' is empty.");
            } else {
                logger.info("✅ Successfully read file '" + filePath + "'. Total lines: " + lineCount);
            }

        } catch (IOException e) {
            logger.error("❌ Error reading file '" + filePath + "': " + e.getMessage());
        } finally {
            logger.info("Finished processing file: " + filePath);
        }
    }
}


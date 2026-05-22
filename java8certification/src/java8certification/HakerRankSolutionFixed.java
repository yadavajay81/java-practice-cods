package java8certification;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class HakerRankSolutionFixed {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Read the input file name
        String filename = scan.nextLine();
        String outputFilename = "req_" + filename; // Construct the output file name

        File inputFile = new File(filename);
        if (!inputFile.exists() || inputFile.isDirectory()) {
            System.err.println("Error: Input file does not exist or is a directory.");
            return;
        }

        // Regex pattern to extract timestamps
        String regex = "\\[(\\d{2}/[A-Za-z]{3}/\\d{4}:\\d{2}:\\d{2}:\\d{2}) [-+]\\d{4}\\]";
        Pattern pattern = Pattern.compile(regex);

        Map<String, Integer> timestampCount = new HashMap<>();

        // Read the input file and extract timestamps
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String timestamp = matcher.group(1); // Extract timestamp
                    timestampCount.put(timestamp, timestampCount.getOrDefault(timestamp, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Filter timestamps that appear more than once
        List<String> repeatedTimestamps = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : timestampCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedTimestamps.add(entry.getKey());
            }
        }

        // Write the repeated timestamps to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
            for (String timestamp : repeatedTimestamps) {
                writer.write(timestamp);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing output file: " + e.getMessage());
        }
    }
}

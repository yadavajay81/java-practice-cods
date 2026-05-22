package java8certification;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HakerRankSolution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.print("Enter the filename inputText.txt: ");
        //String filename = scan.nextLine();
        String filename = "inputText.txt";
        String createFilename = "extracted_timestamp.txt";

        File file = new File(filename);

        if (file.exists() && !file.isDirectory()) {
            List<Date> timestamps = new ArrayList<>();
            
            SimpleDateFormat formatter = new SimpleDateFormat("DD/MMM/yyyy:HH:MM:SS"); // Input format with timezone
            String regex = "\\[(\\d{2}/[A-Za-z]{3}/\\d{4}:\\d{2}:\\d{2}:\\d{2}) [-+]\\d{4}\\]";
            // Regex pattern to match [DD/mmm/YYYY:HH:mm:ss -0400]
            Pattern pattern = Pattern.compile(regex);
            
            try (Scanner fileScan = new Scanner(file)) {
                while (fileScan.hasNextLine()) {
                    String line = fileScan.nextLine();
                    Matcher matcher = pattern.matcher(line);
                    
                    while (matcher.find()) {  // Find all matches in the line
                        String timestampStr = matcher.group(1); 
                       try {
                           
                            Date parsedDate = formatter.parse(timestampStr);
                            timestamps.add(parsedDate);
                            
                           
                            
                            
                        } catch (ParseException e) { 
                            System.err.println("Error parsing date from line: " + timestampStr + " - " + e.getMessage());
                        }
                    }
                }

                
               
                
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(createFilename))) {
                	 for (Date timestamp : timestamps) {
                	writer.write(formatter.format(timestamp)); // Write the extracted timestamp to file
                	writer.newLine();
                	System.out.println(formatter.format(timestamp));
                	 }
                	 } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("Error writing to file.");
                }

            } catch (FileNotFoundException e) { 
                System.err.println("Error: File not found.");
            }

        } else {
            System.err.println("Error: The specified file does not exist or is a directory.");
        }

        //scan.close();  // Close scanner to avoid resource leaks
    }
}

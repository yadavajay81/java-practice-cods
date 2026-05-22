package java8certification;

import java.io.*;
import java.util.*;
import java.util.regex.*;



public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String args[]) throws Exception {
        // read the string filename
        String filename;
        filename = scan.nextLine();
        String outputFileName = "req_"+filename;
        
        File inputFile = new File(filename);
        
        if(!inputFile.exists() && inputFile.isDirectory()) {
        	System.err.println("File not exist or is a directory!");
        	return;
        }
        String regex = "\\[(\\d{2}/[A-Za-z]{3}/\\d{4}:\\d{2}:\\d{2}:\\d{2}) [-+]\\d{4}\\]";
        Pattern pattern = Pattern.compile(regex);
        Map<String, Integer> timestampCounted= new HashMap<>();
        //read file
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
        	String line;
        	while((line=reader.readLine()) !=null) {
        		Matcher matcher = pattern.matcher(line);
        		if(matcher.find()) {
        			String timestamp = matcher.group(1);
        			timestampCounted.put(timestamp, timestampCounted.getOrDefault(timestamp, 0)+1);
        		}
        		
        	}
        	
        }catch(IOException e) {
        	System.err.println("Error in reading file: "+e.getMessage());
        	return;
        	
        }
        //get which is more than 1
        List<String> timestamps = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : timestampCounted.entrySet()) {
        	if(entry.getValue()>1) {
        		timestamps.add(entry.getKey());
        		System.out.println(entry.getKey());
        	}
        	
        }
        //write file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))){
        	for(String timestamp: timestamps) {
        		writer.write(timestamp);
        		writer.newLine();
        	}
        	
        }catch(IOException e) {
        	System.err.println("Error in writing file: "+e.getMessage());
        	return;
        	
        }
    }
}

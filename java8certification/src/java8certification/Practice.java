package java8certification;

import java.io.*;
import java.util.*;
import java.util.regex.*;

//import javax.sql.RowSet;

//import org.junit.runner.Request;

//import be.abeel.bioinformatics.Record;
//import edu.stanford.nlp.optimization.Function;


public class Practice {
	 private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String args[]) throws Exception {
	        // read the string filename
	        String filename;
	        filename = scan.nextLine();
	        String outputFileName = "req_"+filename;
	        
	        File inputFile = new File(filename);
	        if(!inputFile.exists() && inputFile.isDirectory()) {
	        	System.err.println("File not exist or it is a direcotry");
	        	return;
	        }
	        //[01/Jul/1995:00:00:12 -0400]
	        String regex = "\\[(\\d{2}/[A-Za-z]{3}/\\d{4}:\\d{2}:\\d{2}:\\d{2}) [-+]\\d{4}\\]";
	        Pattern pattern = Pattern.compile(regex);
	        
	        Map<String, Integer> timestampsCount = new HashMap<>();
	       //Read file
	        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
	        	String line;
	        	while((line=reader.readLine()) != null) {
	        		Matcher matcher = pattern.matcher(line);
	        		if(matcher.find()) {
	        			String timestamp = matcher.group(1);
	        			
	        			timestampsCount.put(timestamp, timestampsCount.getOrDefault(timestamp, 0) +1);	
	        		}
	        		
	        	}
	        	
	        }catch(IOException e) {
	        	System.err.println("Error in file reading "+e.getMessage());
	        	return;
	        }
	        
	        //Get repeted timestamp
	        List<String> repetedTimestamp = new ArrayList<>();
	        for(Map.Entry<String, Integer> entry : timestampsCount.entrySet()) {
	        	if(entry.getValue() > 1) {
	        		repetedTimestamp.add(entry.getKey());
	        	}
	        }
	        
	        //Write in oututFile
	        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))){
	        	for(String timestamp: repetedTimestamp) {
	        		System.out.println(timestamp);
	        		writer.write(timestamp);
	        		writer.newLine();
	        	}
	        	
	        }catch(IOException e) {
	        	System.err.println("Error in writing file "+ e.getMessage());
	        	return;
	        	
	        }
	        
	    }
	}

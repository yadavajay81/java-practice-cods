package download;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

public class FileDownloader {

    // URL of the base directory to start downloading files from
    private static final String BASE_URL = "http://example.com/files/";

    public static void main(String[] args) throws IOException {
        // Specify the root directory where files will be saved
        Path rootDir = Paths.get("downloaded_files");

        // List of file paths (relative to BASE_URL) - this should ideally be retrieved dynamically
        List<String> filePaths = Arrays.asList(
            "folder1/file1.txt",
            "folder1/file2.txt",
            "folder2/file3.jpg",
            "folder2/folder3/file4.png"
        );

        // Download each file
        for (String filePath : filePaths) {
            downloadFile(BASE_URL + filePath, rootDir.resolve(filePath));
        }
    }

    // Downloads a file from the URL and saves it locally
    private static void downloadFile(String fileUrl, Path localPath) throws IOException {
        // Create directories if they do not exist
        Files.createDirectories(localPath.getParent());

        // Open connection to the URL
        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the file from the connection
        try (InputStream in = connection.getInputStream();
             OutputStream out = Files.newOutputStream(localPath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }

        System.out.println("Downloaded: " + fileUrl + " -> " + localPath);
    }
}


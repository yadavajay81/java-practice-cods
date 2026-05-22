package download;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



//<dependency>
//<groupId>org.jsoup</groupId>
//<artifactId>jsoup</artifactId>
//<version>1.15.4</version>
//</dependency>

public class RecursiveFileLister {

    public static void main(String[] args) throws IOException {
        String baseUrl = "http://example.com/files/";
        List<String> allFiles = new ArrayList<>();
        listFilesRecursive(baseUrl, "", allFiles);

        for (String file : allFiles) {
            System.out.println(file);
        }
    }

    public static void listFilesRecursive(String currentUrl, String currentPath, List<String> fileList) throws IOException {
        Document doc = Jsoup.connect(currentUrl).get();
        Elements links = doc.select("a[href]");

        for (Element link : links) {
            String href = link.attr("href");

            // Skip parent directory
            if (href.equals("../")) continue;

            if (href.endsWith("/")) {
                // It's a folder — recurse into it
                listFilesRecursive(currentUrl + href, currentPath + href, fileList);
            } else {
                // It's a file — add with relative path
                fileList.add(currentPath + href);
            }
        }
    }
}


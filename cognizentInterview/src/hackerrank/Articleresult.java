package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Articleresult {
	
	public static List<String> topArticles(int limit) {
        List<Article> articles = new ArrayList<>();
        int page = 1;
        int totalPages = 1;

        while (page <= totalPages) {
            try {
                String apiUrl = "https://jsonmock.hackerrank.com/api/articles?page=" + page;
                HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
                connection.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }

                reader.close();
                String response = sb.toString();

                // Get total pages
                if (page == 1) {
                    int totalPagesIndex = response.indexOf("\"total_pages\":") + 14;
                    int commaIndex = response.indexOf(",", totalPagesIndex);
                    totalPages = Integer.parseInt(response.substring(totalPagesIndex, commaIndex).trim());
                }

                // Parse articles manually (crude but works under constraints)
                String[] entries = response.split("\\{");
                for (String entry : entries) {
                    if (!entry.contains("\"title\":") && !entry.contains("\"story_title\":")) continue;

                    String title = null;
                    if (entry.contains("\"title\":")) {
                        int tIndex = entry.indexOf("\"title\":") + 9;
                        if (entry.charAt(tIndex) == 'n') continue; // null
                        int end = entry.indexOf("\"", tIndex + 1);
                        title = entry.substring(tIndex + 1, end);
                    }

                    if ((title == null || title.equals("null")) && entry.contains("\"story_title\":")) {
                        int sIndex = entry.indexOf("\"story_title\":") + 15;
                        if (entry.charAt(sIndex) == 'n') continue; // null
                        int end = entry.indexOf("\"", sIndex + 1);
                        title = entry.substring(sIndex + 1, end);
                    }

                    if (title == null || title.equals("null")) continue;

                    int comments = 0;
                    if (entry.contains("\"num_comments\":")) {
                        int cIndex = entry.indexOf("\"num_comments\":") + 16;
                        int comma = entry.indexOf(",", cIndex);
                        try {
                            comments = Integer.parseInt(entry.substring(cIndex, comma).trim());
                        } catch (Exception ignored) {}
                    }

                    articles.add(new Article(title, comments));
                }

                page++;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        // Sort by comments descending, then title descending
        articles.sort((a, b) -> {
            if (b.comments != a.comments) return b.comments - a.comments;
            return b.title.compareToIgnoreCase(a.title);
        });

        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.min(limit, articles.size()); i++) {
            result.add(articles.get(i).title);
        }

        return result;
    }

    static class Article {
        String title;
        int comments;

        Article(String title, int comments) {
            this.title = title;
            this.comments = comments;
        }
    }

}

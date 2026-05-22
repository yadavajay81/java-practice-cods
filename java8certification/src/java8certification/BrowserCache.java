package java8certification;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserCache {
    private final int capacity;
    private final LinkedHashMap<String, String> cache;

    public BrowserCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<String, String>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > capacity;
            }
        };
    }

    public void visitSite(String url) {
        cache.remove(url); 
        cache.put(url, url); 
    }

    public void displayCache() {
        System.out.println("Cache:");
        cache.values().stream()
            .sorted((a, b) -> 0) 
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        BrowserCache browserCache = new BrowserCache(5);

        browserCache.visitSite("abc5.com");
        browserCache.visitSite("abc4.com");
        browserCache.visitSite("abc3.com");
        browserCache.visitSite("abc2.com");
        browserCache.visitSite("abc1.com");
        browserCache.displayCache();

        System.out.println("\nVisiting abc6.com:");
        browserCache.visitSite("abc6.com");
        browserCache.displayCache();

        System.out.println("\nVisiting abc2.com again:");
        browserCache.visitSite("abc2.com");
        browserCache.displayCache();
    }
}


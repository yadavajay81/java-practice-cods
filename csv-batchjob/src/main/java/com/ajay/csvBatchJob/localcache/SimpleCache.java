package com.ajay.csvBatchJob.localcache;

import java.util.concurrent.ConcurrentHashMap;

public class SimpleCache<K, V> {
	
	private final ConcurrentHashMap<K, V> cache = new ConcurrentHashMap<>();
	
	public void put(K key, V value) {
		cache.put(key, value);
	}
	
	public V get(K key) {
		return cache.get(key);
	}
	
	public boolean containsKey(K key) {
		return cache.containsKey(key);
	}
	
	public void invalidate(K key) {
		cache.remove(key);
	}
	
	public void clear(K key) {
		cache.clear();
	}

}

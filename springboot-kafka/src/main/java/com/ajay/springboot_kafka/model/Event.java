package com.ajay.springboot_kafka.model;



public class Event {
	private String id;
	private String message;
	private long timestamp;
	
	// Constructors, Getters, Setters
    public Event() {}

    public Event(String id, String message) {
        this.id = id;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }

}

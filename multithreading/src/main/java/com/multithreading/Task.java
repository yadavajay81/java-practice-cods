package com.multithreading;

public class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        // Implement the logic for each task here
        System.out.println("Executing task: " + taskName);
    }
}


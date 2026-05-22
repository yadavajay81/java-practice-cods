package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private ExecutorService taskExecutor;

    @Async
    public void executeTasks(List<String> tasks) throws InterruptedException, ExecutionException {
        List<Callable<Void>> callables = new ArrayList<>();
        for (String task : tasks) {
            callables.add(() -> {
                // Implement the logic for each task here
                System.out.println("Executing task: " + task);
                return null;
            });
        }

        List<Future<Void>> futures = taskExecutor.invokeAll(callables);

        // Wait for all tasks to finish
        for (Future<Void> future : futures) {
            future.get();
        }
    }
}




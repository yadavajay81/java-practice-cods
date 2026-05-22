package com.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/execute")
    public void executeTasks() throws InterruptedException, ExecutionException {
        List<String> tasks = Arrays.asList("Task 1", "Task 2", "Task 3", "Task 4");
        myService.executeTasks(tasks);
    }
}


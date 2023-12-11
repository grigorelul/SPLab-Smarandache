package com.example.splabsmarandache.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class AsynchronousExecutorService implements CommandProcessor {
    private static final int THREADS_COUNT = 8;

    private ExecutorService executor = Executors.newFixedThreadPool(THREADS_COUNT);

    //Command este ceea ce se ruleaza in sine, iar contextul contine datele care vor fi folosite pentru comanda
    public void executeCommand(Command command, CommandContext context) {
        try {
            executor.submit(() -> {
                command.execute(context);
            });
        }
        catch(Exception e) {
            System.out.println("Exception while executing command " + command.toString() + ": " + e);
        }
    }
}
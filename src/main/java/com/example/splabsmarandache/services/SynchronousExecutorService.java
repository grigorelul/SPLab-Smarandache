package com.example.splabsmarandache.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SynchronousExecutorService {
    public void executeCommand(Command command, CommandContext commandContext) {
        try {
            command.execute(commandContext);
        }
        catch(Exception e) {
            log.error("Exception while executing command " + command.toString(), e);
        }
    }
}
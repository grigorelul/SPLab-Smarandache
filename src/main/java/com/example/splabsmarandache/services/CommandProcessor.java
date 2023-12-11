package com.example.splabsmarandache.services;

public interface CommandProcessor {

    void executeCommand(Command command, CommandContext commandContext);
}
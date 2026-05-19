package com.ICT.server;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class TestController {

    private final MessageRepository repo;

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    public TestController(MessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String home() {
        return "ICT Server Running";
    }

    @GetMapping("/health")
    public String health() {
        long count = repo.count();
        return "OK - Messages in DB: " + count;
    }


    @PostMapping("/message")
    public String addMessage(@RequestParam String text) {
        logger.info("Received message: {}", text);
        repo.save(new Message(text));
        logger.info("Message saved to database");
        return "Saved message: " + text;
    }


    @GetMapping("/messages")
    public List<Message> getMessages() {
        return repo.findAll();
    }

    @GetMapping("/test-error")
    public String testError() {
        logger.warn("Simulated system failure triggered");
        throw new RuntimeException("Simulated server failure for testing");
    }
}
package com.example.async.controller;

import com.example.async.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.CompletionStage;

@Slf4j
@RestControllerAdvice
@RequestMapping("/api")
public class ApiController {

    private final AsyncService asyncService;

    public ApiController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GetMapping("/hello")
    public CompletionStage hello(){
        log.info("compltable futrue init");
        return asyncService.run();
    }
}

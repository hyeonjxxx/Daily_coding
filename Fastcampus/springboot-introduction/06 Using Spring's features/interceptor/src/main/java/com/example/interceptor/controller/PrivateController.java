package com.example.interceptor.controller;

import com.example.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
@Auth   // interceptor에서 해당 어노테이션이 있을 경우만 세션 검사후 통과
@Slf4j
public class PrivateController {
// 내부사용자 또는 세션이 인증된 사용자만 사용가능한  API (권한차이가 필요함)

    @GetMapping("/hello")
    public String hello(){
        log.info("private hello controller");
        return "private hello";
    }
}

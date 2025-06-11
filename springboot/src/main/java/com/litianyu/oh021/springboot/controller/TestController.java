package com.litianyu.oh021.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // lombok 提供的 logger 对象
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        log.debug("path:/hello | param: {} | level: debug", name);
        log.info("path:/hello | param: {} | level: info", name);
        log.warn("path:/hello | param: {} | level: warn", name);
        log.error("path:/hello | param: {} | level: error", name);
        return "hi " + name + "! hello world!";
    }
}

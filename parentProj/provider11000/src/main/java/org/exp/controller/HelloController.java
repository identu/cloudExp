package org.exp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {
    @Value("${word}")
    private String word;
    @GetMapping("/say")
    public String Hello(){
        System.out.println(word);
        return "hello world! there is port 11000! "+word;
    }
}

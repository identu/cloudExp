package org.exp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloController {

    @GetMapping("/say")
    public String Hi(){
        return "hi world! there is port 11011!";
    }
}

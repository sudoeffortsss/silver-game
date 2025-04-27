package com.laioffer.silvergame.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
//        return "Hello World!";
        return "Hi Allen. How is your weekend so far?";
    }
}

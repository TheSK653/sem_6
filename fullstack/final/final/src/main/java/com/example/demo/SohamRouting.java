package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SohamRouting {
    @GetMapping("/")
    public String index() {
        return "Hello World from get method";
    }
    @PostMapping("/")
    public String index2() {
        return "Hello World from post mathod";
    }

}
@RestController
class User{
    @GetMapping("/users")
    public Integer users() {
        return 1;
    }
}
package org.codebaithak.learnspring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamateWorld {

    @GetMapping("/")
    public String hello() {
        return "Namaste ji fromm hello method";
    }
}

@RestController
class Waheguru {

    @GetMapping("/sam")
    public String hello() {
        return "Waheguru ji";
    }
}

@RestController
class Lol {

    @GetMapping("/mav")
    public String hello() {
        return "Maverixk ji";
    }
}

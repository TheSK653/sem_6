package org.codebaithak.learnspring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Namaste {

    @GetMapping( "/")
    public String hello() {
        System.out.println("NamasteWorld-1");
        return "Namasteworld-1";
    }
}

@RestController
class HelloWorld {
    @GetMapping( "/sam")
    public String hello() {
        System.out.println("helloWorld-1");
        return "helloworld-1";
    }
}

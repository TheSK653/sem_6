package org.codebaithak.learnspring1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Learnspring1Application implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(Learnspring1Application.class, args);
    }

    //private RazorPay paymentService = new RazorPay();
    private RazorPay paymentService;

    public Learnspring1Application(RazorPay paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pay();
        System.out.println(payment);
    }
}

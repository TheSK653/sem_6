package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FinalApplication.class, args);
    }

//	private final RazorpayPaymentService paymentService = new RazorpayPaymentService();
//	@Autowired
    private final paymentServiceInterface paymentService;

    public FinalApplication(paymentServiceInterface paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentService.pays();
        System.out.println(payment);
    }
}

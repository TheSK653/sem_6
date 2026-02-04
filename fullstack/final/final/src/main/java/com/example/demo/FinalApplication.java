package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalApplication.class, args);
	}
	private final PaymentServiceInterface paymentService;

	public FinalApplication(PaymentServiceInterface paymentService){
		this.paymentService = paymentService;
	}
//	@Override
	public void run(String... args) throws Exception{
		String payment=paymentService.payment();
		System.out.println(payment);
	}

}

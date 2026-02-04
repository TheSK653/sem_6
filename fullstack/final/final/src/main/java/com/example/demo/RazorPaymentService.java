package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue = "razorpay")
public class RazorPaymentService implements PaymentServiceInterface{
    @Override
    public String payment() {
        String payment="Razorpay";
        System.out.println("payment done via "+payment);
        return payment;
    }
}

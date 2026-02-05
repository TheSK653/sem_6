package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripePayementService implements paymentServiceInterface {

    @Override
    public String pays() {
        String payment = "Stripe";
        System.out.println("payment done via :" + payment);
        return payment;
    }
}

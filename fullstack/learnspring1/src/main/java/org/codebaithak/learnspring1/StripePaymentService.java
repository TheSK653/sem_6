package org.codebaithak.learnspring1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "Stripe")
public class StripePaymentService implements PaymentSerivice {

    @Override
    public String payment() {
        String payment = "Stripe Payment-1";
        System.out.println("Payment is done via: ");
        return payment;
    }
}

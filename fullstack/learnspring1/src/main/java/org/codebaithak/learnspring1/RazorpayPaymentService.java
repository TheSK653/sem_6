package org.codebaithak.learnspring1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//this is known as component scanning = so now we dont need to create objects
//here the bean is  created and spring container will store it in warehouse
@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "Razorpay")
public class RazorpayPaymentService implements PaymentSerivice {

    @Override
    public String payment() {
        String payment = "Razorpay Payment-1";
        System.out.println("Payment is done via: ");
        return payment;
    }
}

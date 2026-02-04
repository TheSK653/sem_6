package org.codebaithak.learnspring1;

import org.springframework.stereotype.Component;

@Component
public class RazorPay {
    public String pay() {
        String payment = "Razorpay";
        System.out.println("payment done from: "+payment);
        return payment;
    }
}

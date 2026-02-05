package org.codebaithak.learnspring1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Learnspring1Application implements CommandLineRunner {

    //1.here we can use static objects only - else call object to use it
    public static void main(String[] args) {
        SpringApplication.run(Learnspring1Application.class, args);
    }

    //	2.call the object here since we can only use static objects
    //	private RazorpayPaymentService paymentService = new RazorpayPaymentService();  //commented code
    // 7. object tha ab component scanning ki vajah se we dont need it
    //	@Autowired
    //	14. change to payment service
    private final PaymentSerivice paymentService;

    //  6.1.here private because I dont want to give access outside the classs
    //	6.2.writing final is good
    //8. here it is object/bean which is not being used
    // 9. since our application is dependant on bean we need to create constructor, make sure argument ho
    //jab bhi main class use hogi now it needs dependancy - of razorpay object (tightly coupled)
    //	11. remove construtor and add @Autowired
    public Learnspring1Application(PaymentSerivice paymentService) {
        this.paymentService = paymentService;
    }

    //	10 who is sending object dependancy object - framework will send the object automatically
    //	3. here we can sue non-static objects also
    //	@Override
    public void run(String... args) throws Exception {
        String payment = paymentService.payment();
        System.out.println(payment);
    }
}
//4.since this application is tighly coupled so we need to use beans here to make it loosely coupled
//5.beans are object lifecycle is managed by spring container

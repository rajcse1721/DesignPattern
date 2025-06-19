package org.project.solidPrinciple.OCP.BadCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod , double amount){
        if(paymentMethod.equals("CreditCard")){
            //business logic
            System.out.println("Making payment via Credit card :" + amount);
        } else if (paymentMethod.equals("Debit Card")) {
            System.out.println("Making payment via Debit card :" + amount);
        } else if (paymentMethod.equals("paypal")) {
            System.out.println("Making payment via PayPal :" + amount);
        }
        else {
            throw  new IllegalArgumentException("Unsupported payment method" + paymentMethod);
        }
    }
}

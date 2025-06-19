package org.project.solidPrinciple.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();

        processor.processPayment(creditCard, 10000);

        PaymentMethod upi = new UPI();
        processor.processPayment(upi , 2000);
    }
}

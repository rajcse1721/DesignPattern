package org.project.solidPrinciple.OCP.GoodCode;

public class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("payment through the upi : " + amount);
    }
}

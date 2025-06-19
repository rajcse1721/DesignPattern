package org.project.solidPrinciple.OCP.GoodCode;

public class PayPal implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("payment via paypal" + amount);
    }
}

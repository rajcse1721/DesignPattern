package org.project.solidPrinciple.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment via credit card : " + amount);
    }
}

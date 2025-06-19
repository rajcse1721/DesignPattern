package org.project.solidPrinciple.OCP.GoodCode;

public class DebitCard implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("payment via debit card" + amount);
    }
}

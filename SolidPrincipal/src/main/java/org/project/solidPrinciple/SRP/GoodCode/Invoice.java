package org.project.solidPrinciple.SRP.GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount" + amount);
    }
}

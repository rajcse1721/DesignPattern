package org.project.solidPrinciple.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount" + amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving to database");
    }

    public  void  sendEmailNotification(){
        System.out.println("sending email notification for invoice");
    }
}

package org.project.solidPrinciple.ISP.GoodCode;

public class MultiPurposePrinter implements Printer,Scanner,Copyer{
    @Override
    public void copy(Document doc) {
        System.out.println("Copying the document....");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing the document....");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning the document....");
    }
}

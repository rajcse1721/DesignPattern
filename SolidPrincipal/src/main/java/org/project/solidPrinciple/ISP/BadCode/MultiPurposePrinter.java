package org.project.solidPrinciple.ISP.BadCode;

public class MultiPurposePrinter implements  Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning the document");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying the document");
    }
}

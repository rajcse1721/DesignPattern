package org.project.solidPrinciple.ISP.BadCode;

public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document....");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scanning not support");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Copying not support");
    }
}

package org.project.solidPrinciple.LSP.GoodCode;

public class WriteableFile extends ReadableFile implements  Writeable{

    @Override
    public void write() {
        System.out.println("writting to a file....");
    }
}

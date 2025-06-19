package org.project.solidPrinciple.LSP.GoodCode;

public class main {
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.read();
        writeableFile.write();


    }
}

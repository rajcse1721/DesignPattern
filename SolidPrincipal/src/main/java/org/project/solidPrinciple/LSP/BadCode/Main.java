package org.project.solidPrinciple.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read(); //works fine
        file.write(); // throw exception , violation of LSP

    }
}

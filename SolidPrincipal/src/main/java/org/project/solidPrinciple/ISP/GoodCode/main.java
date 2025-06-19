package org.project.solidPrinciple.ISP.GoodCode;


public class main {
    public static void main(String[] args) {

        Document document = new Document("Mybdgedhbdcccccccccccccccceh3gfcjgfdhgsfwhfxn");

        Printer printer = new MultiPurposePrinter();
        printer.print(document);
        Scanner scanner = new MultiPurposePrinter();
        scanner.scan(document);
        Copyer copyer = new MultiPurposePrinter();
        copyer.copy(document);

        System.out.println("------------------------------");

        Printer printer1 = new SimplePrinter();
        printer1.print(document);
//        Scanner scanner1 = new SimplePrinter();
//        scanner1.scan(document);
//        Copyer copyer1 = new SimplePrinter();
//        copyer1.copy(document);

    }
}

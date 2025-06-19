package org.project.solidPrinciple.ISP.BadCode;

public class main {
    public static void main(String[] args) {
        Document document = new Document("Mybdgedhbeh3gfcjgfdhgsfwhfxn");

        Machine machine1 = new MultiPurposePrinter();
        machine1.print(document);
        machine1.copy(document);
        machine1.scan(document);

        System.out.println("------------------------------");

        Machine machine = new SimplePrinter();
        machine.print(document);
        machine.copy(document);
        machine.scan(document);
    }
}

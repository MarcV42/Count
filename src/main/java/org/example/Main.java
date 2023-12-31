package org.example;

public class Main {
    public static void main(String[] args) {

        Count obj1 = new Count();
        Count obj2 = new Count();

        System.out.println("totalCount (vorher): " + Count.getTotalCount()); // Ausgabe: totalCount (vorher): 2
        Count.incrementTotalCount();
        System.out.println("totalCount (nachher): " + Count.getTotalCount()); // Ausgabe: totalCount (nachher): 3

        System.out.println("instanceCount (obj1 vorher): " + obj1.getInstanceCount()); // Ausgabe: instanceCount (obj1 vorher): 1
        obj1.incrementInstanceCount();
        System.out.println("instanceCount (obj1 nachher): " + obj1.getInstanceCount()); // Ausgabe: instanceCount (obj1 nachher): 2

        System.out.println("instanceCount (obj2 vorher): " + obj2.getInstanceCount()); // Ausgabe: instanceCount (obj2 vorher): 1
        obj2.incrementInstanceCount();
        System.out.println("instanceCount (obj2 nachher): " + obj2.getInstanceCount()); // Ausgabe: instanceCount (obj2 nachher): 2

        System.out.println("Aktueller totalCount: " + Count.getTotalCount()); // Ausgabe: Aktueller totalCount: 4
        System.out.println("Aktueller instanceCount (obj1): " + obj1.getInstanceCount()); // Ausgabe: Aktueller instanceCount (obj1): 2
        System.out.println("Aktueller instanceCount (obj2): " + obj2.getInstanceCount()); // Ausgabe: Aktueller instanceCount (obj2): 2

        int num1 = 80;
        int num2 = 20;

        int sum = Calculator.add(num1, num2);
        System.out.println("Sum: " + sum); // Ausgabe: Sum: 30

        int sum_minus = Calculator.subtra(num1, num2);
        System.out.println("Sum: " + sum_minus); // Ausgabe: Sum: 30

        int sum_multi = Calculator.multipl(num1, num2);
        System.out.println("Sum: " + sum_multi); // Ausgabe: Sum: 30

        int sum_div = Calculator.division(num1, num2);
        System.out.println("Sum: " + sum_div); // Ausgabe: Sum: 30
    }


}

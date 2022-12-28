package it.develhope.exercise39;

public class Start {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marco","Verde",15);
        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();
        System.out.println("------------------");
        Employee employee2 = new Employee("Mario","Rossi", 20);
        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}

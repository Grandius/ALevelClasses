package ua.kozhanov.HW6;

public class Task1 {

    public static void main(String[] args) {

        Phone phone1 = new Phone("784513323643", "Xiaomi", 567.9);
        Phone phone2 = new Phone("13456765498765", "Samsung");
        Phone phone3 = new Phone();
        System.out.println("Empty phone3: " + phone3);
        phone2.setWeight(56.7);
        phone3.setNumber("38045147712578");
        phone3.setModel("Realme");
        phone3.setWeight(187.89);

        System.out.println("Phone 1 number is " + phone1.getNumber());
        phone1.receiveCall("Bob");
        System.out.println("Phone 2 number is " + phone2.getNumber());
        phone2.receiveCall("Alice");
        System.out.println("Phone 3 number is " + phone3.getNumber());
        phone3.receiveCall("John");
        System.out.println("Testing toString: ");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

    }
}

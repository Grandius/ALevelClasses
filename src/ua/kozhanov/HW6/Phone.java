package ua.kozhanov.HW6;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }


    public Phone(String num, String mod, double w) {

        this(num, mod);
        weight = w;
    }

    public Phone(String num, String mod) {

        number = num;
        model = mod;
    }

    Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " with number" + number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


}

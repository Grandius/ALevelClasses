package ua.kozhanov.HW6;

public class Phone {

    private String number;
    private String model;
    private double weight;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

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
    

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


}

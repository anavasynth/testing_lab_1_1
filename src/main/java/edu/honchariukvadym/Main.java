package edu.honchariukvadym;

public class Main {
    public static void main(String[] args) {
        HumanIMB humanIMB = new HumanIMB(80, 1.52);

        // Використання гетерів для отримання значень
        System.out.println("Weight: " + humanIMB.getWeight());
        System.out.println("Height: " + humanIMB.getHeight());

        System.out.println("IMT Result: " + humanIMB.getIMTResult());

        // Використання сетерів для зміни значень
        humanIMB.setWeight(70);
        humanIMB.setHeight(1.75);

        System.out.println("Updated Weight: " + humanIMB.getWeight());
        System.out.println("Updated Height: " + humanIMB.getHeight());
        System.out.println("Updated IMT Result: " + humanIMB.getIMTResult());
    }
}
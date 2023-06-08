package org.lessons.java.zoo;

public class Main {
    public static void main(String[] args) {

        Animale[] zoo = new Animale[4];

        zoo[0] = new Cane();
        zoo[1] = new Passerotto();
        zoo[2] = new Aquila();
        zoo[3] = new Delfino();

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("--- " + (i + 1) + "° animale ---");
            System.out.println("Animale: " + zoo[i].getClass().getSimpleName());
            System.out.print("Dice:");
            zoo[i].verso();
            System.out.print("Mangia:");
            zoo[i].mangia();
            System.out.print("Dorme:");
            zoo[i].dormi();
        }

    }
}

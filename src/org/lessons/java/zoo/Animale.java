package org.lessons.java.zoo;

public abstract class Animale {

    //METODI -----------------------------
    //concreti
    public void dormi() {
        System.out.println("Zzz");
    }

    public void stampaAnimale() {
        System.out.println("Animale: " + this.getClass().getSimpleName());
        System.out.print("Dice:");
        verso();
        System.out.print("Mangia:");
        mangia();
        System.out.print("Dorme:");
        dormi();
    }

    //astratti
    public abstract void verso();
    public abstract void mangia();

}

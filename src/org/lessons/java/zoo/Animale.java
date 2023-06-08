package org.lessons.java.zoo;

public abstract class Animale {

    //METODI -----------------------------
    //concreti
    public void dormi() {
        System.out.println("Zzz");
    }

    //astratti
    public abstract void verso();
    public abstract void mangia();

}

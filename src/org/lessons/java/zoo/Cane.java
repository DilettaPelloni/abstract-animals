package org.lessons.java.zoo;

public class Cane extends Animale implements Nuotatore{

    //METODI -----------------------------
    //da Animale
    @Override
    public void verso() {
        System.out.println("Bau");
    }
    @Override
    public void mangia() {
        System.out.println("Croccantini");
    }

    //da Nuotatore
    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}

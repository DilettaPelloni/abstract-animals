package org.lessons.java.zoo;

public class Passerotto extends Animale implements Volante{

    //METODI -----------------------------
    //da Animale
    @Override
    public void verso() {
        System.out.println("Chip");
    }
    @Override
    public void mangia() {
        System.out.println("Semini");
    }

    //da Volante
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}

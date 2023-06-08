package org.lessons.java.zoo;

public class Aquila extends Animale implements Volante{

    //METODI -----------------------------
    //da Animale
    @Override
    public void verso() {
        System.out.println("Craaa(?)");
    }
    @Override
    public void mangia() {
        System.out.println("Piccoli mammiferi(?)");
    }

    //da Volante
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

}

package org.lessons.java.zoo;

import java.security.spec.RSAOtherPrimeInfo;

public class Delfino extends Animale implements Nuotatore{

    //METODI -----------------------------
    //da Animale
    @Override
    public void verso() {
        System.out.println("Delfiiiiin");
    }
    @Override
    public void mangia() {
        System.out.println("tante cose buone");
    }

    //da Nuotatore
    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}

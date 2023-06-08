package org.lessons.java.zoo;

public class Main {
    //MAIN
    public static void main(String[] args) {

        //----------------------------------- PRIMO ESERCIZIO + EXTRA -----------------------------------
        //ZOO --------------------------------------------------------------------
        Animale[] zoo = new Animale[4];
        zoo[0] = new Cane();
        zoo[1] = new Passerotto();
        zoo[2] = new Aquila();
        zoo[3] = new Delfino();
        System.out.println("------------- STAMPO TUTTI GLI ANIMALI -------------");
        for (int i = 0; i < zoo.length; i++) {
            System.out.println("--- " + (i + 1) + "° animale ---");
            zoo[i].stampaAnimale();
        }

        //VOLIERA --------------------------------------------------------------------
        Volante[] voliera = new Volante[2];
        voliera[0] = new Aquila();
        voliera[1] = new Passerotto();
        System.out.println("------------- STAMPO TUTTI GLI ANIMALI VOLANTI -------------");
        for (int i = 0; i < voliera.length; i++) {
            System.out.println("--- " + (i + 1) + "° animale ---");
            if(voliera[i] instanceof Animale) {
                ((Animale) voliera[i]).stampaAnimale();
            }
            System.out.print("Vola: ");
            voliera[i].vola();
        }

        //ACQUARIO --------------------------------------------------------------------
        Nuotatore[] acquario = new Nuotatore[2];
        acquario[0] = new Cane();
        acquario[1] = new Delfino();
        System.out.println("------------- STAMPO TUTTI GLI ANIMALI CHE NUOTANO -------------");
        for (int i = 0; i < acquario.length; i++) {
            System.out.println("--- " + (i + 1) + "° animale ---");
            if(acquario[i] instanceof Animale) {
                ((Animale) acquario[i]).stampaAnimale();
            }
            System.out.print("Nuota: ");
            acquario[i].nuota();
        }

        //----------------------------------- SECONDO ESERCIZIO -----------------------------------
        System.out.println("------------- NUOTA O VOLA? -------------");
        for (int i = 0; i < zoo.length; i++) {
            System.out.println("--- " + (i + 1) + "° animale ---");
            System.out.println("Animale: " + zoo[i].getClass().getSimpleName());
            if(zoo[i] instanceof Volante) {
                System.out.print("Vola: ");
                faiVolare((Volante)zoo[i]);
            }
            if(zoo[i] instanceof Nuotatore) {
                System.out.print("Nuota: ");
                faiNuotare((Nuotatore) zoo[i]);
            }
        }
    }

    //METODI
    public static void faiVolare(Volante animale) {
        animale.vola();
    }
    public static void faiNuotare(Nuotatore animale) {
        animale.nuota();
    }
}

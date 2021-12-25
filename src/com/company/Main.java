package com.company;

public class Main {

    public static void main(String[] args) {
	    Margarita margarita = new Margarita(300, 1.23, false);
        Pepperoni pepperoni = new Pepperoni(250, 1.54, true);
        LaFinta laFinta = new LaFinta(120, 0.76, false);


        margarita.cook();
        margarita.delivery();
        System.out.println(margarita);
        System.out.println();

        pepperoni.cook();
        pepperoni.delivery();
        System.out.println(pepperoni);
        System.out.println();

        laFinta.cook();
        laFinta.delivery();
        System.out.println(laFinta);
        System.out.println();

    }
}

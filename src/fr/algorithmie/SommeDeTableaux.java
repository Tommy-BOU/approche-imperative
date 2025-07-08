package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int[] tabSomme = new int[tab1.length];


        for (int i = 0; i < tabSomme.length; i++) {
            tabSomme[i] = tab1[i] + tab2[i];
        }

        System.out.println("Tableau contenant la somme des 2 précédents tableaux :");
        System.out.println(Arrays.toString(tabSomme));
    }
}

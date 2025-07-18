package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Tableau :");
        for (int val : array){
            System.out.println(val);
        }

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Tableau inversé :");
        for (int i = array.length -1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

        System.out.println("-----------------------------------------------------------------------------------");

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println("Tableau copié :");
        for (int val : arrayCopy){
            System.out.println(val);
        }
    }
}

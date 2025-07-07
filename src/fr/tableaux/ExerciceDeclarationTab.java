package fr.tableaux;

import java.util.Arrays;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        System.out.println(tableau[tableau.length - 1]);

        // échoue car le tableau ne fait que 8 cases
//        System.out.println(tableau[10]);

        tableau = Arrays.copyOf(tableau, tableau.length + 2);
        System.out.println(Arrays.toString(tableau));

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }
}

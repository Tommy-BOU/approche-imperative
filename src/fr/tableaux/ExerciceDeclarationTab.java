package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        System.out.println(tableau[tableau.length - 1]);

        // échoue car le tableau ne fait que 8 cases
        System.out.println(tableau[10]);
    }
}

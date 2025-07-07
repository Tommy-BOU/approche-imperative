package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] entiers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(entiers[0]);
        System.out.println(entiers.length);
        System.out.println(entiers[entiers.length - 1]);
        entiers[4] = 8;
    }
}

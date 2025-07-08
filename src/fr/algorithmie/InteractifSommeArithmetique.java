package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 1 et 10");
        while (num < 1 || num > 10) {
            num = scanner.nextInt();
        }

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.println("Somme des entiers entre 1 et " + num + " : " + sum);
    }
}

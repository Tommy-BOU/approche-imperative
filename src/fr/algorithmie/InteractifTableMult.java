package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 1 et 10");
        while (num < 1 || num > 10) {
            num = scanner.nextInt();
        }

        System.out.println("Table de multiplication de " + num);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " x " + i + " = " + num * i );
        }
    }
}

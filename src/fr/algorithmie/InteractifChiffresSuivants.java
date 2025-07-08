package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 1 et 10");
        while (num < 1 || num > 10) {
            num = scanner.nextInt();
        }

        for (int i = num + 1; i <= num + 10 ; i++) {
            System.out.println(i);
        }
    }
}

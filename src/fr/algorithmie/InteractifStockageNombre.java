package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int[] array = new int[0];
        displayMenu(0, array);
    }

    public static void displayMenu(int menuNum, int[] array){
        Scanner scanner = new Scanner(System.in);
        if (menuNum == 0)
        {
            System.out.println("Choisissez une option : \n 1 - Ajouter un nombre. \n 2 - Afficher les nombres existants");
            while (menuNum < 1 || menuNum > 2){
                menuNum = scanner.nextInt();
            }

            displayMenu(menuNum, array);
        }
        if (menuNum == 1){
            System.out.println("Ajutez un nombre au tableau");
            int newNum = scanner.nextInt();
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = newNum;

            displayMenu(0, array);
        }
        if (menuNum == 2){
            System.out.println("Voici les nombres actuels du tableau :");
            System.out.println(Arrays.toString((array)));
            displayMenu(0, array);
        }
    }
}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        int menuOption = 0;
        Scanner scanner = new Scanner(System.in);

        displayMenu(menuOption);

    }

    public static void displayMenu(int menuNum){
        if (menuNum == 0)
        {
            System.out.println("Choisissez une option : \n 1 - Ajouter un nombre. \n 2 - Afficher les nombres existants");
            while (menuNum < 1 || menuNum > 2){

            }
        }
    }
}

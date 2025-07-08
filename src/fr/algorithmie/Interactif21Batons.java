package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        int nbBatons = 21;
        Random random = new Random();

        int firstPlayer = random.nextInt(0, 2);

        if (firstPlayer == 0) {
            System.out.println("Vous commencez");
            PlayerPlay(nbBatons);
        } else {
            System.out.println("L'ordinateur commence");
            ComputerPlay(nbBatons);
        }


    }

    public static void PlayerPlay(int nbBatons) {
        Scanner scanner = new Scanner(System.in);
        int pickedNumber = 0;
        System.out.println("Choisissez un nombre entre 1 et 3");
        while (pickedNumber < 1 || pickedNumber > 3) {
            pickedNumber = scanner.nextInt();
        }
        nbBatons -= pickedNumber;

        if (nbBatons < 1) {
            System.out.println("Batons restant : " + nbBatons);
            System.out.println("Vous avez perdu.");
        } else if (nbBatons == 1) {
            System.out.println("Batons restant : " + nbBatons);
            System.out.println("Vous avez gagné !");
        } else {
            System.out.println("Batons restant : " + nbBatons);
            System.out.println("Au tour de l'ordinateur");
            ComputerPlay(nbBatons);
        }

    }

    public static void ComputerPlay(int nbBatons) {
        int pickedNumber = PickRandomNumber(nbBatons);
        System.out.println("L'ordinateur prend " + pickedNumber + " batons.");
        nbBatons -= pickedNumber;
        System.out.println("Batons restant : " + nbBatons);
        if (nbBatons == 1) {
            System.out.println("Vous avez perdu.");
        } else {
            PlayerPlay(nbBatons);
        }
    }

    public static int PickRandomNumber(int nbBatons) {
        Random random = new Random();

        int pickedNum = random.nextInt(1, 4);

        if (nbBatons - pickedNum < 1) {
            return PickRandomNumber(nbBatons);
        } else {
            return pickedNum;
        }
    }
}

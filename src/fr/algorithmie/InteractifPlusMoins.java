package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(1, 101);
        int playerChoice = 0;
        int moves = 0;

        System.out.println("Choisissez un nombre entre 1 et 100");
        while (playerChoice != target){
            playerChoice = scanner.nextInt();
            moves++;

            if (playerChoice > target){
                System.out.println("Plus bas");
            }
            else if (playerChoice < target){
                System.out.println("Plus haut");
            }
        }

        System.out.println("Bravo, vous avez trouvé en " + moves + " coups !");

    }
}

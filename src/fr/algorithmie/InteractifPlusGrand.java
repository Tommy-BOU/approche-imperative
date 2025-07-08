package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("entrez un nombre pour l'index " + i);
            nums[i] = scanner.nextInt();

            if (nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println("Le nombre le plus élevé est " + max);
    }
}

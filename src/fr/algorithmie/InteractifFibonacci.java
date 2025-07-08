package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un nombre");
        int num = scanner.nextInt();

        int val = 1;
        int derniereVal = 1;

        System.out.println("Rangs fibonacci jusqu'à " + num + " :");
        for (int i = 0; i < num; i++) {

            int tempNum = val;

            if (i == 0){
                System.out.println(1);
            }
            val += derniereVal;
            derniereVal = tempNum;
            System.out.println(val);
        }
    }
}

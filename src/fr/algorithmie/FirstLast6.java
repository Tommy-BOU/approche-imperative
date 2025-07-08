package fr.algorithmie;

import java.util.Random;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] array = {6, 2};

        boolean firstLast6 = array.length > 0 && array[0] == 6 || array[array.length - 1] == 6;

        System.out.println("Le tableau contient au moins un élément et le premier ou le dernier élément est 6 : " + firstLast6);
    }
}

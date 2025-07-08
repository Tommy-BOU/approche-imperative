package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        int[] array = {6, 6};

        boolean firstLast = array.length >= 1 && array[0] == array[array.length - 1];
    }
}

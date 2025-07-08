package fr.algorithmie;

public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int max = 0;
        int secondMax = 0;

        for (int val : array){
            if (val > max){
                max = val;
            }
            if (val > secondMax && val < max){
                secondMax = val;
            }
        }

        System.out.println("Second plus grand élément du tableau : " + secondMax);

    }
}

package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int[] tabSomme = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            if (i < tab2.length){
                tabSomme[i] = tab1[i] + tab2[i];
            }
            else {
                tabSomme[i] = tab1[i];
            }

            System.out.println(tabSomme[i]);
        }

    }
}

package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int entier = 8128;
        int sum = 0;

        for (int i = 1; i < entier; i++) {
            if (entier % i == 0)
            {
                sum += i;
            }
        }

        boolean isPerfect = entier == sum;

        System.out.println("Le nombre " + entier + " est " + (isPerfect ? "parfait" : "imparfait"));
    }
}

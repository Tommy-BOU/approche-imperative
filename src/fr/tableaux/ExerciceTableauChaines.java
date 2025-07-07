package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = { "Paris", "Londres", "Berlin", "New-york", "Tokyo"};

        for (String ville : villes) {
            System.out.println(ville);
        }

        System.out.println(villes.length);

        villes[3] = "Reims";

        for (String ville : villes) {
            System.out.println(ville);
        }
    }
}

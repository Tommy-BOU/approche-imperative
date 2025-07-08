package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String chaine = "aaaaabbbbbbcccccccdddddddd";

        String nouvelleChaine = "";
        int compteur = 0;
        char characterActuel = chaine.charAt(0);

        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) == characterActuel)
            {
                compteur ++;

                if (i == chaine.length() - 1)
                {
                    nouvelleChaine = nouvelleChaine + characterActuel + compteur;
                    characterActuel = chaine.charAt(i);
                    compteur = 1;
                }
            }
            else{
                nouvelleChaine = nouvelleChaine + characterActuel + compteur;
                characterActuel = chaine.charAt(i);
                compteur = 1;
            }
        }

        System.out.println(nouvelleChaine);

    }
}

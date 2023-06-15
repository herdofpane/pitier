package exercice;

import java.util.ArrayList;
import java.util.List;

public class EfficacitePire {

    public static List<String> solution(String str, List<Character> ordre) {
        List<String> motOrdreList = new ArrayList<>(); // Liste des mots dans l'ordre
        List<String> motSepareList = new ArrayList<>(); // Liste des mots séparés
        String mots = ""; // Mot en cours de traitement

        char[] caracteres = str.toCharArray(); // Convertir la chaine de caractère en tableau de caractère
        for (int i = 0; i < caracteres.length; i++) { // Parcourir chaque caractère du tableau de caractère (moins
                                                      // optimiser que la boucle foreach)
            char caractere = caracteres[i]; // Récupérer le caractère à l'indice i

            if (caractere == ' ' || caractere == '\'' || caractere == ',') { // Si le caractère est un espace, une
                                                                             // apostrophe ou une virgule
                if (!mots.isEmpty()) { // De plus, si le mot n'est pas vide
                    motSepareList.add(mots); // Ajouter le mot à la liste des mots séparés
                    mots = ""; // Réinitialiser le mot
                }
            } else {
                mots += caractere; // Ajouter le caractère au mot
            }
        }

        if (!mots.isEmpty()) { // Si le mot n'est pas vide
            motSepareList.add(mots); // Ajouter le mot à la liste des mots séparés
        }

        if (str.isEmpty()) { // Si la chaine de caractère est vide
            motOrdreList.add(""); // Ajouter un mot vide à la liste des mots dans l'ordre
        } else {
            for (int i = 0; i < ordre.size(); i++) { // Parcourir chaque caractère de la liste des caractères dans
                                                     // l'ordre
                char motOrd = ordre.get(i); // Récupérer le caractère à l'indice i

                for (int j = 0; j < motSepareList.size(); j++) { // Parcourir chaque mot de la liste des mots séparés
                    String motSep = motSepareList.get(j); // Récupérer le mot à l'indice j

                    if (motSep.charAt(0) == motOrd) { // Si le premier caractère du mot est égal au caractère dans
                                                      // l'ordre
                        motOrdreList.add(motSep);
                    }
                }
            }

            for (int i = 0; i < motSepareList.size(); i++) { // Parcourir chaque mot de la liste des mots séparés
                String motSep = motSepareList.get(i); // Récupérer le mot à l'indice i

                if (!motOrdreList.contains(motSep)) { // Si le mot n'est pas déjà dans la liste des mots dans l'ordre
                    motOrdreList.add(motSep); // Ajouter le mot à la liste des mots dans l'ordre
                }
            }
        }

        return motOrdreList; // Retourner la liste des mots dans l'ordre
    }
}

// Points particuliers à améliorer :
// - La boucle for (int i = 0; i < caracteres.length; i++) { // Parcourir chaque
// caractère du tableau de caractère (moins optimiser que la boucle foreach)
// - La boucle for (int i = 0; i < ordre.size(); i++) { // Parcourir chaque
// caractère de la liste des caractères dans l'ordre
// Avec des boubles foreach, le code serait plus optimisé car il n'y aurait pas
// besoin de récupérer l'indice de l'élément dans la liste ou le tableau de
// caractère.

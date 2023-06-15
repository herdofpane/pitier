package exercice;

import java.util.*;

import java.util.List;

public class Exercice {
    static ArrayList<String> tokens = new ArrayList<>();
    static ArrayList<String> listefinale = new ArrayList<>();

    public static List<String> solution(String str, List<Character> ordre) {
        listefinale.clear();
        // Verifie que la chaine n'est pas vide
        if (str.isEmpty()) {
            List<String> list = listefinale;
            return list;
        }

        // Permet de separer la Sring en plusieur partie pour recuperer chaque mots
        // Les partie a separer sont délimité par des espace, des apostrophes, ect...
        StringTokenizer tokenizer = new StringTokenizer(str, " ;’;, ;'");

        // Premet de rajouter chaque mots dans une ArrayList
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            tokens.add(token);
        }
        // Verifie que la chaine ne contient pas qu'un seul mots
        if (tokens.size() == 1) {
            listefinale.add("" + str);
            return listefinale;
        }

        trie(tokens, ordre);
        return listefinale;
    }

    public static void trie(ArrayList<String> listeMots, List<Character> listeLettre) {
        ArrayList<String> motsL = listeMots;
        List<Character> lettreL = listeLettre;

        for (int i = 0; i < lettreL.size(); i++) {
            for (int y = 0; y < motsL.size(); y++) {
                String mots = motsL.get(y);
                char lettre = lettreL.get(i);

                if (estPresent(mots, lettre)) {
                    listefinale.add(mots);
                    motsL.remove(y);
                }
            }
        }

        if (motsL.size() != 0) {
            for (int i = 0; i < motsL.size(); i++) {
                listefinale.add(motsL.get(i));
            }
        }
    }

    public static boolean estPresent(String mots, char lettres) {
        return mots.charAt(0) == lettres;
    }
}

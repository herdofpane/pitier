package exercice;

import java.util.*;

import java.util.List;

public class Exercice2 {
    static ArrayList<String> listefinale = new ArrayList<>();

    public static List<String> solution(String str, List<Character> ordre) {
        listefinale.clear();
        if (str.isEmpty()) {
            return listefinale;
        }

        String[] mots = str.split("[ ;’;,']+");
        if (mots.length == 1) {
            listefinale.add(str);
            return listefinale;
        }

        trie(mots, ordre);
        return listefinale;
    }

    public static void trie(String[] mots, List<Character> listeLettre) {
        List<String> motsL = new ArrayList<>(List.of(mots));
        List<Character> lettreL = listeLettre;

        for (Character lettre : lettreL) {
            for (int i = 0; i < motsL.size(); i++) {
                String mot = motsL.get(i);

                if (estPresent(mot, lettre)) {
                    listefinale.add(mot);
                    motsL.remove(i);
                    i--;
                }
            }
        }

        listefinale.addAll(motsL);
    }

    public static boolean estPresent(String mot, char lettre) {
        return mot.charAt(0) == lettre;
    }

}

package exercice;

import java.util.List;
import java.util.ArrayList;

public class sobriete_pire {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String word = str.substring(i, j + 1);
                boolean containsLetter = true;

                for (char c : ordre) {
                    if (!word.contains(String.valueOf(c))) {
                        containsLetter = false;
                        break;
                    }
                }

                if (containsLetter) {
                    result.add(word);
                }
            }
        }

        return result;
    }
}

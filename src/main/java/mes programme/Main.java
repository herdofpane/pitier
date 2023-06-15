package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "daef hgr hsrw  hrsr tggv e ";
        List<Character> ordre = List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o');
        System.out.println(Exercice.solution(texte, ordre));
        System.out.println(Exercice2.solution(texte, ordre));
        // output: [classer, texte, exemple, a, de]
    }
}

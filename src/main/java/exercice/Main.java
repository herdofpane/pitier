package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "Il fait beau aujourd'hui comme en aout";
        List<Character> ordre = List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o');
        // taille memoire
        Runtime runtime = Runtime.getRuntime();

        // tm
        runtime.gc();
        // temps exec
        long startTime = System.currentTimeMillis();
        System.out.println(Exercicee.solution(texte, ordre));
        // te
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        // tm
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        long usedMemoryMB = usedMemory / (1024 * 1024);

        System.out.println("Temps d'exécution : " + executionTime + " ms");
        System.out.println("Mémoire utilisée : " + usedMemoryMB + " Mo");

        // ["fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"]
    }
}

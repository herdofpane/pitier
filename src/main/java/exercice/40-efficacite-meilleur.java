package exercice;

import java.util.*;

public class Exercice {

	public static List<String> solution(String str, List<Character> ordre) {
		List<String> listeMot = new ArrayList<>();
		StringBuilder motActuel = new StringBuilder();

		// on isole chacun des mots pour pouvoir ensuite les triers
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetterOrDigit(str.charAt(i))) {
				motActuel.append(str.charAt(i));
			} else if (motActuel.length() > 0) {
				listeMot.add(motActuel.toString());
				motActuel.setLength(0);
			}

			// condition pour ajouter le dernier mot de la chaine str
		}
		if (motActuel.length() > 0) {
			listeMot.add(motActuel.toString());
		}

		// pour chaque lettre de l'ordre, on cherche les mots qui commen�ent par cette
		// lettre et on les ajoute a une nouvelle arrayList

		List<String> listeMotTrie = new ArrayList<>();

		for (int i = 0; i < ordre.size(); i++) {
			String debut = ordre.get(i).toString();
			for (int j = 0; j < listeMot.size(); j++) {
				if (listeMot.get(j).startsWith(debut)) {
					listeMotTrie.add(listeMot.get(j));
					listeMot.remove(listeMot.get(j));
					j--;
				}
			}
		}
		// � la fin, les mots non tri�s sont ajout�s sans ordre
		for (int i = 0; i < listeMot.size(); i++) {
			listeMotTrie.add(listeMot.get(i));
		}

		return listeMotTrie;

	}

}

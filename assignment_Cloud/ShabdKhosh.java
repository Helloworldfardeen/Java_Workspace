// unable to complete sir ...due lack of practise.....
// what the use of chat gpt copypast
package assignment_Cloud;

import java.util.*;

public class ShabdKhosh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of words
		int N = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		// Read the words
		String[] words = new String[N];
		for (int i = 0; i < N; i++) {
			words[i] = scanner.nextLine();
		}

		// Perform word chaining
		List<String> chain = chainWords(words);

		// Print the result
		if (chain.isEmpty()) {
			System.out.println("IMPOSSIBLE");
		} else {
			for (String word : chain) {
				System.out.println(word);
			}
		}

		scanner.close();
	}

	public static List<String> chainWords(String[] words) {
		List<String> chain = new ArrayList<>();
		boolean[] used = new boolean[words.length];
		chain.add(words[0]); // Start with the first word
		used[0] = true;

		if (chainWordsHelper(words, chain, used)) {
			return chain; // Successful chaining
		} else {
			return Collections.emptyList(); // No chaining possible
		}
	}

	private static boolean chainWordsHelper(String[] words, List<String> chain, boolean[] used) {
		if (chain.size() == words.length) {
			return true; // All words are chained
		}

		String lastWord = chain.get(chain.size() - 1);
		for (int i = 0; i < words.length; i++) {
			if (!used[i] && canChain(lastWord, words[i])) {
				chain.add(words[i]);
				used[i] = true;
				if (chainWordsHelper(words, chain, used)) {
					return true; // Chaining successful
				}
				// Backtrack
				chain.remove(chain.size() - 1);
				used[i] = false;
			}
		}
		return false; // No valid chaining found
	}

	private static boolean canChain(String word1, String word2) {
		int overlap = Math.min(word1.length(), word2.length()) - 3;
		return word1.endsWith(word2.substring(0, overlap));
	}
}

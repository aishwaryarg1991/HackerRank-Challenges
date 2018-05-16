/*
Input Format
The first line contains a string denoting . 
The second line contains a string denoting .
Output Format
Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead
 */

package introduction.challanges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		a = a.toLowerCase();
		b = b.toLowerCase();
		// populate a maps with letters and frequencies of String A and B resp.
		Map<Character, Integer> mapA = new HashMap<>();
		Map<Character, Integer> mapB = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char letterA = a.charAt(i);

			if (!mapA.containsKey(letterA)) {
				mapA.put(letterA, 1);
			} else {
				Integer frequency = mapA.get(letterA);
				mapA.put(letterA, ++frequency);
			}
		}
		System.out.println(mapA);

		for (int j = 0; j < b.length(); j++) {
			char letterB = b.charAt(j);

			if (!mapB.containsKey(letterB)) {
				mapB.put(letterB, 1);
			} else {
				int freq = mapB.get(letterB);
				mapB.put(letterB, ++freq);
			}
		}
		System.out.println(mapB);

		// Check whether these two maps have the same frequencies for resp keys.
		for (Character ch1 : mapA.keySet()) {
			if (!mapA.get(ch1).equals(mapB.get(ch1)))
				return false;
		}
		/*
		 * for (Character ch2 : mapB.keySet()) { if
		 * (!mapB.get(ch2).equals(mapA.get(ch2))) return false; }
		 */

		return true;

	}

}

/* http://farenda.com/java/java-regex-remove-duplicated-words/
 * Input Format
The following input is handled for you the given stub code:
The first line contains an integer, n , denoting the number of sentences. 
Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.
 *Output Format
Stub code in the editor prints the sentence modified by the replaceAll line to stdout. The modified string must be a modified version of the initial sentence where all repeat occurrences of each word are removed. 
 */
package introduction.challanges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2_DuplicateWords {

	public static void main(String[] args) {

		String regex = "\\b(\\w+)(\\s+\\1\\b)+"; // "/* Write a RegEx matching repeated words here. */";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // correct Pattern flag, if you want to match words in case insensitive way 

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1)); // (The regex to replace , The replacement)
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}
	/*
	 
	 * \b: look for word boundary (match only beginning of word instead of somewhere in the middle); 
	 * (\w+): match one ore more word characters and remember them as a group(the()) to which later we can refer to using a number; so this matches a complete word and remembers it; 
	 * \s+: match one or more space characters;
	 * \1: match the word remembered in step 2; 
	 * \b: like in step 1 – make sure it’s not a part of some longer word;
	 *  (\s+\1\b)+: match one or more occurrences of the word captured in step 2.
	 */
}

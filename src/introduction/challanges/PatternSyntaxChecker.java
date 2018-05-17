/*
Input Format
The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

Output Format
For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.package introduction.challanges;
 */
package introduction.challanges;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {          //while (testCases-- > 0)
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);   //returns pattern object
				System.out.println("Valid ");
				
			}catch(PatternSyntaxException E) {
				System.out.println("Invalid");
				//System.out.println(E.getMessage());				
			}
			testCases--;
		}
	}
}

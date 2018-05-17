/*Input Format
The first line of input contains an integer n , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.
The username consists of 8 to 30 characters inclusive. If the username consists of less than  or greater than characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters[a-z] , uppercase characters[A-Z] , and digits[0-9] .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
Output Format
For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.
*/
package introduction.challanges;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}

class UsernameValidator {

	public static final String regularExpression = "^[a-zA-Z][0-9a-zA-Z_]{7,29}$"; // "^[a-z A-Z] \\w{7,29}$"
}
/*
 * ^[a-zA-Z] = first word ; ^ it represents an anchor for the start of the input otherwise "~dbkdbvdk" get approved.
 * \w =  [a-zA-Z_0-9]
 * {7,29}$ = number of words; to assure that even when the range {7,29} expires there are no other characters after that 
 
 */


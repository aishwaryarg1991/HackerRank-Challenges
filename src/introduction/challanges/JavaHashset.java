/*
 In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.
Constraints:
Length of each string is atmost  and will consist lower case letters only.
Output Format
Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.
5
john tom
john mary
john tom
mary anna
mary anna
 */
package introduction.challanges;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		
		HashSet<String> hash= new HashSet<>(t);
		for (int i = 0 ; i<t ; i++) {
		    hash.add("(" + pair_left[i] + ","  + pair_right[i] + ")");  //or  hash.add( pair_left[i] + " "  + pair_right[i] );

		    System.out.println(hash.size());
		}

		/* #################NOT WORKING 
		 * int sum = 0;
		if (!pair_left[0].isEmpty() | !pair_right[0].isEmpty()) {
			sum = 1;
		}
		System.out.println("the value of sum for " + sum);

		for (int i = 1; i < t; i++) {
			for (int j = 0; j < i; j++) {

				if (pair_left[i].equals(pair_left[j]) & pair_right[i].equals(pair_right[j])) {
					continue;
				} else
					sum = sum + 1;
			}

			System.out.println("the value of sum for " + i + "is :" + sum);

		}*/
	}

}

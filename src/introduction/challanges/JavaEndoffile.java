/*
 Input Format
Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format
For each line, print the line number, followed by a single space, and then the line content received as input.

 */

package introduction.challanges;

import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args) {
		System.out.print("Max number of input lines : ");
		Scanner sc= new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("Please enter input : ");
		sc.nextLine();
		 int i = 0;
		   while(sc.hasNext()){
		       i++;
		       System.out.println(i + " " + sc.nextLine());
		       if (i>= count) break;
		   }
		   System.out.println("Reached the maximum input lines");
		
		

	}

}

/*
 * Input Format
There will be two lines containing two numbers, a and b .

Constraints
a and b are non-negative integers and can have maximum 200 digits.

Output Format
Output two lines. The first line should contain a+b , and the second line should contain a*b . Don't print any leading zeros.
 */

package introduction.challanges;

import java.math.BigInteger;
import java.util.Scanner;


public class JavaBigInteger {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			BigInteger num1 = sc.nextBigInteger();// or  BigInteger num1 = new BigInteger(scan.next());
		   	BigInteger num2 = sc.nextBigInteger();
			System.out.println(num1.add(num2));
			System.out.println(num1.multiply(num2));
		
		

	}

}

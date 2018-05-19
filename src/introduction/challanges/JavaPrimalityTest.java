/*
 *Input Format
A single line containing an integer,  (the number to be checked).

Output Format
If n is a prime number, print prime; otherwise, print not prime.
 */
package introduction.challanges;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       String n = scanner.nextLine();
       BigInteger number= new BigInteger(n); 

       if(number.isProbablePrime(1))
    		   {
    	   System.out.println("prime");
    		   }
       else
       {
    	   System.out.println("not prime"); 
       }
        scanner.close();
    }
}
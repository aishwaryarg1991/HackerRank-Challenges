/*
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 */

package introduction.challanges;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String A = sc.next();
	    String B = new StringBuilder(A).reverse().toString();//The reverse() method returns a StringBuilder object, not a String.
	    if (A.compareTo(B)==0)   // A.equals(B)
	       {
	    	System.out.println("Yes");
	    	//System.out.println(A.compareTo(B)); 0
	    	//System.out.println( A.equals(B));   true
	       }
	    else 
	    	{
	    	System.out.println("No");
	    	//System.out.println(A.compareTo(B)); difference
	    	//System.out.println( A.equals(B));  false
	    	}
	    /*OR
	     System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
	    */

	}

}

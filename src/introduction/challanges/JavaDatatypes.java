/*
 Input Format:
The first line contains an integer, , denoting the number of test cases. 
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format:
For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it.
 */


package introduction.challanges;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String []argh)
    {
	    System.out.println("Enter the count of numbers to be entered:  ");
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
        	 System.out.println("Enter the number:");
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
               // if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>= Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>= Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>= Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
               // if(x>= Long.MIN_VALUE && x<=Long.MAX_VALUE)
                	System.out.println("* long");
                	
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }


}

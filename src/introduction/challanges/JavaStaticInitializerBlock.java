/*
 * Input Format
There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

 Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */


package introduction.challanges;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
     static boolean flag= true;
     static Scanner sc= new Scanner(System.in);
     static int B= sc.nextInt();
     static int H= sc.nextInt();
   static
   {
     try
     {
    	 if (B<=0 || H<=0)
    	 {
    		 flag= false;
    		 throw new Exception ("Breadth and height must be positive");
    		 
         }
     }catch(Exception E)
     {
    	 System.out.println(E);    	 
     }
   }
    	 
     
	
	
	public static void main(String[] args) {
		if(flag)
		{
		int area = B*H;
		System.out.println(area);
	    }

    }
}

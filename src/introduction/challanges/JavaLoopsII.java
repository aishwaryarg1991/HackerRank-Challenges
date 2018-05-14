/*We use the integers a, b, and n to create the following series:
 (a + 2^0 .b), (a + 2^0 .b + 2^1.b), .......n values 
 S0          ,  S1                 , .......Sn-1
*/

package introduction.challanges;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculate(a,b,n);
            System.out.println();
        }
        in.close();
    }

    public static void  calculate(int a , int b , int n)
    { 
    	for (int count= 0 ; count< n; count ++)
    	{   
    		int  result =0 ;
    		for (int power=0 ; power<=count ; power++)
    		{
    		 result = (int) (result +  Math.pow(2, power) * b);
    		}
    		int finalres = a + result;    		
    	System.out.print( (a + result) + " ");
    	
    	}
    }
}
    


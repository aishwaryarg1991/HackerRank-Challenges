/*
 *Given an array, , of  real number strings, sort them in descending order — but wait,there's more! 
 *Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1 , and 0.1  is printed as 0.1. 
 *If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).
INput format: The first line consists of a single integer, n, denoting the number of integer strings. 
Each line i of the n subsequent lines contains a real number denoting the value of s.
 */

package introduction.challanges;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

	 public static void main(String []args){
	        //Input
	       Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        String []s=new String[n];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	      	
	      	s= Arrays.copyOf(s,n);
      /*OR  String newArray[] = new String[n];
	        for(int i= 0;i < newArray.length; i++)
	            {
	            newArray[i] = s[i];
	        }*/

/*We want to sort in descending order while preserving the contents of each String.
A comparator can achieve this for us. We convert to BigDecimal inside our comparator so that the change is not permanent and our String's form for each number is preserved.*/
	       
	        // Arrays.sort(newArray, Collections.reverseOrder(new Comparator<String>() {
	        Arrays.sort(s, new Comparator<String>() {
	        @Override
	            public int compare(String s1, String s2) {
	                BigDecimal a = new BigDecimal(s1);
	                BigDecimal b = new BigDecimal(s2);
	                return -a.compareTo(b);
	            }
	        });

	       // s = newArray;
	      	
	      	
	      	
	        //Output
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }

	}



/*
 * A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format
The first line contains a single integer, , denoting the length of array . 
The second line contains  space-separated integers describing each respective element, , in array .
 
Output Format
Print the number of subarrays of  having negative sums.
 */
package introduction.challanges;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] A = new int[n];
		int sum= 0;
		int count = 0 ;
		
		for (int i= 0 ; i< n ; i++) {
			A[i]= sc.nextInt();
		}
		
		
		
		for (int i= 0 ; i< n ; i++) {
			sum = 0;
			for(int j= i ; j< n ; j++ ) {
				 sum = sum + A[j];
				 if (sum < 0 ) {
					// System.out.println("sum is -ve for:" + A[i]+ "to " + A[j] );
					// System.out.println(sum);
					 count ++;
					 }
				 
				/* else 
					 {
					 System.out.println("sum is +ve for:" + A[i]+ "to " + A[j] );
					 System.out.println(sum);					 
					 }*/
				
			}
			
		}
		System.out.println(count);

	}

}

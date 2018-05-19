/*
 Input Format
The first line of input contains two integers n and m : representing the total number of integers and the size of the subarray, respectively. 
The next line contains  space separated integers.
Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .
 * 
 */
package introduction.challanges;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;


public class JavaDequeue {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Deque<Integer> deque = new ArrayDeque<>();
	        HashSet<Integer> set = new HashSet<>();
	        
	        int n = in.nextInt();     //total number of integers
	        int m = in.nextInt();     //the size of the subarrays to be made
	        int max = Integer.MIN_VALUE; // Or 0
       
	        for (int i = 0; i < n; i++) {
	            int input = in.nextInt();
	            
	            deque.add(input); //keep adding
	            set.add(input);
	            // to keep the size always 3, remove the first elements from deque and from set(only if duplicates were not added while makin the set)
	            if (deque.size() == m)  //once the size of deque is M
	            {	            	
	                if (set.size() > max)  
	                	{
	                	max = set.size(); // will have the max size of the set (between 0 and m)                                        
	                	}
	                int first = deque.remove(); 
	                if (!deque.contains(first))  
	                	{
	                	set.remove(first);
	                	}
	            }
	        }
	        
	        System.out.println(max);
	    }
    }


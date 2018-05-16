/*
Input Format
The first line contains a single string denoting . 
The second line contains two space-separated integers denoting the respective values of  and .

Output Format
Print the substring in the inclusive range from start to end -1.
  
 */

package introduction.challanges;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		String str= sc.next();
		int start= sc.nextInt();
		int end= sc.nextInt();
		System.out.println(str.substring(start, end));
		
		/* OR
		  for(int i=start;i<end;i++){
            str += S.charAt(i);
        }
        print(str);
		 */
	}

}

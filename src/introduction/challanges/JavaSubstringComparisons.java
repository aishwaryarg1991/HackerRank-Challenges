/*
Input Format
The first line contains a string denoting s . 
The second line contains an integer denoting k.

Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string
 
 */
// 'smallest' must be the lexicographically smallest substring of length 'k'
// 'largest' must be the lexicographically largest substring of length 'k'

package introduction.challanges;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> sets=new TreeSet<String>();        
        
        for (int i=0 ; i<=s.length()-k ; i++) 
        {
           	//System.out.println(s.substring(i, i+k));
        	sets.add(s.substring(i, i+k));
        }
       smallest= sets.first();
       largest= sets.last();
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
		// TODO Auto-generated method stub

	}

}

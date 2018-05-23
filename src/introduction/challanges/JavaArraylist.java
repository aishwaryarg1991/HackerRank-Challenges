/*
 * Input Format
 The first line has an integer n . In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
 In the next line there will be an integer d denoting number of queries.
 Each query will consist of two integers x and y.

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output
74
52
37
ERROR!
ERROR!
 */
package introduction.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		//A(); //map
		B();   //Arraylist inside a Arraylist

	}

	private static void B() {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int d,q,x,y;
	    ArrayList[] set = new ArrayList[n];
	    for(int i=0;i<n;i++){
	        d = in.nextInt();
	        set[i] = new ArrayList();
	        for(int j=0;j<d;j++){  
	            set[i].add(in.nextInt());                
	        }
	    }
	    q=in.nextInt();
	    for(int i=0;i<q;i++){
	        x=in.nextInt();
	        y=in.nextInt();
	        try{
	            System.out.println(set[x-1].get(y-1));
	        } catch(Exception e){
	            System.out.println("ERROR!");
	        }
	    }
		
	}

	private static void A() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, ArrayList<Integer>> hm = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> A = new ArrayList<>();
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				A.add(sc.nextInt());
			}
			hm.put(i, A);
		}
		
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			try {
				ArrayList<Integer> value = hm.get(x);
				System.out.println(value.get(y - 1)); //or System.out.println(hm.get(x).get(y-1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
			/*
			 * if (hm.containsKey(x) && !hm.get(x).isEmpty() ) {
			 * 
			 * ArrayList<Integer> value = hm.get(x); /* for (int j=0 ; j< value.size(); j++)
			 * { System.out.println(value.get(j)); }
			 */
			/*
			 * if( y <= value.size()) System.out.println(value.get(y-1)); else
			 * System.out.println("Error!");
			 * 
			 * } else { System.out.println("Error!");
			 * 
			 * }
			 */
	
	}

  }
}

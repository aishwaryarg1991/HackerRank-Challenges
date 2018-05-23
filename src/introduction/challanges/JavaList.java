/*
 * Input Format

The first line contains an integer, N (the initial number of elements in L). 
The second line contains N space-separated integers describing L. 
The third line contains an integer, Q (the number of queries). 
The 2Q subsequent lines describe the queries, and each query is described over two lines:
If the first line of a query contains the String Insert, then the second line contains two space separated integers x,y and the value y must be inserted into L at index x .
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.
 Output Format
Print the updated list L as a single line of space-separated integers.
 */

package introduction.challanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		A();

	}

	private static void A() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> L = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			L.add(sc.nextInt());
		}

		int Q = sc.nextInt();
		for (int j = 0; j < Q; j++) {
			String action = sc.next();

			if (action.equals("Insert")) {
				L.add(sc.nextInt(), sc.nextInt());
				// continue;
			} else if (action.equals("Delete")) {
				L.remove(sc.nextInt());
			}
		}

		for (int i = 0; i < L.size(); i++) {
			System.out.print(L.get(i)+ " "); 
		}
		/*OR
		 * for (Integer i : L) {
			System.out.print(i + " ");
		 */

	}

}

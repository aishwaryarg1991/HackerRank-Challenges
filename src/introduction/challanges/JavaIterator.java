/*
 * Java Iterator class can help you to iterate through every element in a collection.
 */
package introduction.challanges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element.toString().equals("###"))// or if(element instanceof String)
				break;
		}
		return it;

	}

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt()); // adding integers
		}

		mylist.add("###");            // add string ###
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());    // adding rest
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}
}

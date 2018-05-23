/*
 * Input Format
The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number. 
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Output Format
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

 */
package introduction.challanges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class JavaMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			m.put(name, phone);
		}
		
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(m.containsKey(s)) {
				System.out.println(s + "=" + m.get(s));
			}
			else
				System.out.println("Not found");
		}
	}
}





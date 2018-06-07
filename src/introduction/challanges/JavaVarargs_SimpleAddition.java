package introduction.challanges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class JavaVarargs_SimpleAddition {

	public static void main(String[] args) {

       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}

class Add{
	/*void add(int ...a) {
		int sum=0;
		for (int  i=0 ; i<a.length; i++) {
			System.out.print(a[i]);	
			if(i!=(a.length-1)) {
				System.out.print("+");
			}
			sum= sum + a[i];
		}
		
		System.out.println("=" + sum);				
	}	
	/*
	 * Or 
	 */
 void add(int ...a) {
	 String seperator = "";
	 int sum=0;
	 for (int i : a) {
		 System.out.print(seperator+i);
		 seperator= "+";
		 sum += i;
	 }
	 System.out.println("="+sum );
 }


}
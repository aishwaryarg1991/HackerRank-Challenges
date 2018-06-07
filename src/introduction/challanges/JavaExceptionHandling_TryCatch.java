/*
 x/y 
 10 3 
 10 Hello
 10 0
 23.323 0
 */

package introduction.challanges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling_TryCatch {

	public static void main(String[] args) {
		A();
		//B();
	}


private static void A() {
	
	Scanner sc =new Scanner(System.in)	;
	try {
		int x= sc.nextInt();
		int y= sc.nextInt();
		int ans= x/y;
		System.out.println(ans);
	}catch(InputMismatchException e) {
		System.out.println(e.getClass().getName());
	}catch(ArithmeticException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}

static void B()
	{
	Scanner sc= new Scanner(System.in);
	String x= sc.nextLine();
	String y= sc.nextLine();
	
	
	try {
		int x1= Integer.parseInt(x);
		int y1= Integer.parseInt(y);
		int ans= x1/y1;
		System.out.println(ans);
	}catch(Exception e){
	System.out.print(e.getClass().getName());
	}
	}
}
	


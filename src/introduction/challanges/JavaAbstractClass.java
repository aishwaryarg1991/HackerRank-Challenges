package introduction.challanges;

import java.util.Scanner;

public class JavaAbstractClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MyBook book = new MyBook();
		book.setTitle(sc.nextLine()); // or  book.title= sc.nextLine();
		System.out.println("The title is: "+book.getTitle());
		

	}

}

abstract class Book{
	String title;
	
	String getTitle()
	{		
	return title;	
	}
	abstract void setTitle(String s);
}

class MyBook extends Book{

	@Override
	void setTitle(String s) {
		title = s;		
	}
	
}

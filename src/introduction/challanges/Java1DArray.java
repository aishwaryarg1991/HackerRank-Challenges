package introduction.challanges;

import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] myArr = new int[n];
		for (int i= 0 ; i<myArr.length ; i++) {
			myArr[i]= sc.nextInt();
		}

		for(int i=0 ; i<myArr.length ; i++) {
			System.out.println(myArr[i]);
		}
		
	}

}

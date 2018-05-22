/*The sum of an hourglass is the sum of all the numbers within it.
 * In this problem you have to print the largest sum among all the hourglasses in the array.
 * You are given a  2D array. An hourglass in an array is a portion shaped like this:
a b c
  d
e f g
 */
package introduction.challanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java2DArray {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		List<Integer> values = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = sc.nextLine().split(" ");
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for (int j = 0; j < 6; j++) {

				arr[i][j] = Integer.parseInt(arrRowItems[j]);

				if (i - 2 >= 0 && j - 2 >= 0) {
					int firstRow = (arr[i][j]) + (arr[i][j - 1]) + (arr[i][j - 2]);
					int secondRow = arr[i - 1][j - 1];
					int thirdRow = arr[i - 2][j] + arr[i - 2][j - 1] + arr[i - 2][j - 2];
					values.add(firstRow + secondRow + thirdRow); // OR int maxSum = Integer.MIN_VALUE;
				}                                                   // int sum= firstrow+secondrow+thirdrow; }
			}                                                       // if (sum > maxSum) {maxSum = sum;}
			System.out.println(Collections.max(values));
			sc.close();
		}

		// System.out.println(sum);

		/*
		 * for (int i = 0 ; i<6 ; i++) { for (int j =0 ; j<6 ; j++) {
		 * System.out.println(arr[i][j]); } }
		 */
	}
}

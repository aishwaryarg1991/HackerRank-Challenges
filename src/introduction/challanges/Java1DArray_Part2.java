/*
 * In other words, you can move from index i to index i+1, i-1 or i+leap as long as the destination index is a cell containing a 0. 
 * If the destination index is greater than n-1, you win the game.i.e if u are on the last element or beyond that. You win!
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
 */
package introduction.challanges;

import java.util.Scanner;

public class Java1DArray_Part2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt(); // no. of queries
		while (q-- > 0) {
			int n = scan.nextInt(); // no. of elements for that query
			int leap = scan.nextInt();// leap for that query

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt(); // n elements
			}

			System.out.println((canWin(leap, game,0)) ? "YES" : "NO"); //0 to start with the first ele in the array 
		}
		scan.close();
	}

		
	
	public static boolean canWin(int leap, int[] game, int i) {   //Function used recursively DFS
        if(i < 0 || game[i] == 1){    
            return false;
        }
      if((i == game.length - 1) || i + leap > game.length - 1){
             return true;
      }
  
      game[i] = 1; //mark as visited
      return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap); 
      // even if any of the above return true. True will be returned to the calling method.
  }
}

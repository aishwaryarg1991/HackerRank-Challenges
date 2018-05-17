/*
Input Format:  A single string, s.
Constraints: s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format: On the first line, print an integer, n, denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .
 */
package introduction.challanges;

import java.util.Scanner;

public class JavaStringTokens {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) {System.out.println("0"); return;} //case9 resolved
        
        String s = scan.nextLine();
        String[] items = s.trim().split("[ !,?.\\_'@]+");

        if(s == ""){
           System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
           System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(items);
        }
        scan.close();
    }
       
        		
        
        /*String strArray[]= s.split(" |\\'|\\,|\\?");
             
        for (int i= 0 ; i<strArray.length; i++)
        {
        	 System.out.println(strArray[i]);
        }*/
        
       
    }

}

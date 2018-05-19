package introduction.challanges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Boolean match= false;
			String regex=("<(.+)>([^<]+)</\\1>");  // ("<(.+)>([^<]+)</\\1>") ;<([^<>]+)>(.*)<\/\1>
			
			Pattern p= Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // remove flag: if you dont want case sensitive
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println(m.group(2));  //
				match= true;
				
			}
			
			 if (match == false) {     // if(!match)
				 System.out.println("None");
			 }
			
			testCases--;
		}
	}

}

/*
 * <(.+)>
   matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.
 * ([^<]+)
   matches all the text in between the HTML start and end tags. We place a special restriction on the text in that it can't have the "<" symbol. The characters inside the parenthesis are saved into Group #2.
*</\\1>
   is to match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1.
*/
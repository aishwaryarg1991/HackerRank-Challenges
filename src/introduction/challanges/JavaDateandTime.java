/*
 * Input Format

A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format
Output Format

Output the correct day in capital letters.
 */

package introduction.challanges;

import java.security.Signer;
import java.util.Calendar;
import java.util.Scanner;

import javax.annotation.Generated;

public class JavaDateandTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		String date = sc.next();
		String year = sc.next();
		 System.out.println(getDay(date, month, year));	

	}

	private static String getDay(String date, String month, String year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String Days[]= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"} ;
	
		return (Days[day-1]) ;
	}

}

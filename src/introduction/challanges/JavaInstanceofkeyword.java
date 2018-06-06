/*
The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.

In this problem we have given you three classes in the editor:
Student class
Rockstar class
Hacker class
In the main method, we populated an ArrayList with several instances of these classes. 
count method calculates how many instances of each type is present in the ArrayList
The code prints three integers, the number of instance of Student class,Rockstar class,Hacker class.
 */
package introduction.challanges;
import java.util.*;

class Students{ }
class Rockstar{   }
class Hacker{}

public class JavaInstanceofkeyword {			
		   static String count(ArrayList mylist){
		      int a = 0,b = 0,c = 0;
		      for(int i = 0; i < mylist.size(); i++){
		         Object element=mylist.get(i);
		         
		         	 //or  if(Students.class.isInstance(element))
		            a++;
		         if (element instanceof Rockstar) //or  (Rockstar.class.isInstance(element))
		            b++;
		         if(element instanceof Hacker)   //or (Hacker.class.isInstance(element))
		            c++;
		      }
		      String ret = a +" "+ b+" "+ c;
		      return ret;
		   }	

		   public static void main(String []args){
		      ArrayList mylist = new ArrayList();
		      Scanner sc = new Scanner(System.in);
		      int t = sc.nextInt();
		      for(int i=0; i<t; i++){
		         String s=sc.next();
		         if(s.equals("Student"))mylist.add(new Students());
		         if(s.equals("Rockstar"))mylist.add(new Rockstar());
		         if(s.equals("Hacker"))mylist.add(new Hacker());
		      }
		      System.out.println(count(mylist));
		   }
		}






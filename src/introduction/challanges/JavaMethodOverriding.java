/*
 Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints 
 the same statement as the superclass' getNumberOfTeamMembers method, 
 except that it replaces  with  (the number of players on a Soccer team).
 */

package introduction.challanges;

public class JavaMethodOverriding {

	public static void main(String[] args) {
		Sports sport= new Sports();
		Soccer soccer = new Soccer();
		System.out.println(sport.getName());
		sport.getNumberOfTeamMembers();
		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();

	}

}


class Sports{
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}	
}

class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
	
}
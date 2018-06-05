/*
When a method in a subclass overrides a method in superclass, 
it is still possible to call the overridden method using super keyword. 
If you write super.func() to call the function func(), 
it will call the method that was defined in the superclass.
 */

package introduction.challanges;

public class JavaMethodOverriding2_SuperKeyword {

	public static void main(String[] args) {
		MotorCycle M=new MotorCycle();
	}
}

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	@Override
	String define_me(){
		return "a cycle with an engine.";
	}
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		String temp=super.define_me(); //Fix this line
		System.out.println("My ancestor is a cycle who is "+ temp );
	
	}
}

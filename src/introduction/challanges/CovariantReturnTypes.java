package introduction.challanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CovariantReturnTypes {
	 
	public static void main(String[] args) throws IOException {
	      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      String s = reader.readLine().trim();
	      Region region = null;
	      switch (s) {
	        case "WestBengal":
	          region = new WestBengal();
	          break;
	        case "AndhraPradesh":
	          region = new AndhraPradesh();
	          break;
	      }
	      Flower flower = region.yourNationalFlower();
	      System.out.println(flower.whatsYourName());
	    }

}

class Flower {
	String whatsYourName() {
		return "I have many names and types";		
	}
}
class Jasmine extends Flower {
	@Override
	String whatsYourName() {
		return "Jasmine";		
	}
	
}
class Lily extends Flower {	
	@Override
	String whatsYourName() {
		return "Lily";
	}
}

 class Region {
	
	Flower yourNationalFlower() {
		return new Flower();		
	}
}

class WestBengal extends Region{
	
	
	Jasmine yourNationalFlower() {
		return  new Jasmine();		
	}
	 
}

class AndhraPradesh extends Region{
	
	
	Lily yourNationalFlower() {
		return new Lily();		
	}

}

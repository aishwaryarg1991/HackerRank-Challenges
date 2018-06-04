package introduction.challanges;

import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		//A();
		B();
		//C();
	
		/*Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(isBalanced(sc.next()));
		}*/
		
		
}

	private static void A() {
		Scanner sc = new Scanner(System.in);
        
	     while (sc.hasNext()) {   
	    String input=sc.next();
	    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
	    System.out.println(input.isEmpty());
	     }
		
	}

	private static void B() {
		Scanner sc = new Scanner(System.in);
		
		
		while (sc.hasNext()) {
			Stack<Character> stacky= new Stack<Character>();
			String s=sc.next();
           for (int i = 0 ; i < s.length() ; i++ ) {
        	   if(s.charAt(i)=='{' | s.charAt(i)=='[' |s.charAt(i)=='(' ) {
				stacky.push(s.charAt(i));
		   }
			 /*for (int i = 0; i < s.length(); i++){
		           if (s.charAt(i) == '(') 
		        	   stacky.push('(');
		           else if (s.charAt(i) == '{')
		        	   stacky.push('{');
		           else if (s.charAt(i) == '[')
		        	   stacky.push('[');*/
        	     
		        /*    if (s.charAt(i) == ')') {
  	               if (stacky.isEmpty()) System.out.println(false); 
  	               if (stacky.pop() != '(') System.out.println(false); //pop and even return false 
  	           }
  	           else if (s.charAt(i) == '}') {
  	               if (stacky.isEmpty()) System.out.println(false);
  	               if (stacky.pop() != '{') System.out.println(false);
  	           }
  	           else if (s.charAt(i) == ']') {
  	               if (stacky.isEmpty()) System.out.println(false);
  	               if (stacky.pop() != '[') System.out.println(false);
  	           }*/
		
	
           switch(s.charAt(i)) {
           case '}': 
        	   if (stacky.isEmpty()) 
        		   System.out.println("false"); 
        	   else if (stacky.peek()== '{') 
        		   stacky.pop(); 
        	   else 
        	      {System.out.println("false");}
           break;
           case ')': if (stacky.isEmpty()) System.out.println("false"); if (stacky.peek()== '(') {stacky.pop();} else {System.out.println("false");}break;
           case ']':  if (stacky.isEmpty()) System.out.println("false"); if (stacky.peek()== '[') {stacky.pop();} else {System.out.println("false");}break;
           }
		}
           System.out.println(stacky.isEmpty());
       }	
		
	}

	
	public static boolean isBalanced(String s) {
		//System.out.println(s);
	       Stack<Character> stack = new Stack<Character>();
	       for (int i = 0; i < s.length(); i++){
	           if (s.charAt(i) == '(') 
	               stack.push('(');
	           else if (s.charAt(i) == '{')
	               stack.push('{');
	           else if (s.charAt(i) == '[')
	               stack.push('[');
	           else if (s.charAt(i) == ')') {
	               if (stack.isEmpty()) return false;
	               if (stack.pop() != '(') return false; //pop and even return false 
	           }
	           else if (s.charAt(i) == '}') {
	               if (stack.isEmpty()) return false;
	               if (stack.pop() != '{') return false;
	           }
	           else if (s.charAt(i) == ']') {
	               if (stack.isEmpty()) return false;
	               if (stack.pop() != '[') return false;
	           }
	       }
	       return stack.isEmpty();
	   }
	
	
	
	private static Map<String,String> myMap = createMap();
	   private static Map<String,String> createMap() {
	       HashMap<String,String> result = new HashMap<String,String>();
	       result.put("(",")");
	       result.put("[","]");
	       result.put("{","}");
	       return Collections.unmodifiableMap(result);
	   }


		private static void C() {
			Scanner sc = new Scanner(System.in);
		      
		       while (sc.hasNext()) {
		           String input=sc.nextLine();
		           Stack myStack = new Stack();          
		           String last;
		           String next;          
		           for (int i=0 ; i<input.length(); i++){
		               next = Character.toString(input.charAt(i));                 
		               if (myStack.empty()) {
		                   myStack.push(next);
		               } else {
		                   last = myStack.peek().toString();
		                   if (myMap.containsKey(last)) {
		                       if (myMap.get(last).equals(next)){
		                           myStack.pop();
		                       } else {
		                           myStack.push(next);
		                       }
		                   } else {
		                       myStack.push(next);
		                       break;
		                   }
		               }                 
		           }
		           System.out.println(myStack.empty());
		       }

		  }


}

	
	
	
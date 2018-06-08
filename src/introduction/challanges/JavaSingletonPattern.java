/*
 * Complete the Singleton class in your editor which contains the following components:
A private Singleton non parameterized constructor.
A public String instance variable named str.
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.

 */
package introduction.challanges;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


public class JavaSingletonPattern {	
	public String str;
	private static JavaSingletonPattern instance = new JavaSingletonPattern();
	
	
	private JavaSingletonPattern() {}
		
	static JavaSingletonPattern getSingleInstance() {
		return instance;
	}
}

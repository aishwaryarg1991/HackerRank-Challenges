/*
 *You have to fill in the incompleted lines so that it prints all the methods of another class called Student in alphabetical order. 
 *We will append your code with the Student class before running it.
 * 
 */

package introduction.challanges;

import java.beans.MethodDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

    public static void main(String[] args){
       
    	Class student = Student1.class;  //student just becomes a variable. It's of type Class. You can use it to get information about the class
        Method[] methods = student.getDeclaredMethods() ; //methods that you actually declared, getMethods() will give all methods declared in class+ methods in parent class(default Object class)

        ArrayList<String> methodList = new ArrayList<>();
        for( Method str: methods){
            methodList.add(str.getName());;//Returns the name of the method represented by this Method object, as a String.
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
   /*OR public static void main(String[] args){
        Student1 st= new Student1();
    	Class student = st.getClass();  
        Method[] methods = student.getDeclaredMethods() ;

        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0 ; i< methods.length; i++){
            methodList.add(methods[i].getName());;
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }*/

}

class Student1{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}
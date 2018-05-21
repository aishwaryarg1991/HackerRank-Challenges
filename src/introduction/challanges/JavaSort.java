/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
Input Format
The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:
ID Name CGPA
Output Format
After rearranging the students according to the above rules, print the first name of each student on a separate line.
 */
package introduction.challanges;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class sortStudents implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getCgpa()!= s2.getCgpa())
		{
			return  (s1.getCgpa() > s2.getCgpa()? -1: 1);
		}
		else if (s1.getFname().compareTo(s2.getFname())!=0)   //(!s1.getFname().equals(s2.getFname()))
				{
			return s1.getFname().compareTo(s2.getFname());   //if in decreasing order -s1.getFname().compareTo(s2.getFname()) or s2.getFname().compareTo(s1.getFname())
				}
		else
			return s1.getId()-s2.getId();
				
	}
	
	
}

public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
      Collections.sort(studentList, new sortStudents());
      	
      for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

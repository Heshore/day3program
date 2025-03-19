package day3program;
import java.util.*;
class Student{
	String name="ravi";
	int rollNum=06;
	String dept="CS";
	
	void displayData() {
		System.out.println("My Name is: "+name);
		System.out.println("Roll Number:"+rollNum);
		System.out.println("Department:"+dept);
		}
	}
public class Oops {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.displayData();
	}
}

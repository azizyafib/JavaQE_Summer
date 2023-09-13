package ifElseUseCase;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {
	
	String name;
	int age;
	double salary;
	String gender;
	
	public static void main (String args []) {
		
		Scanner employee1 = new Scanner (System.in);
		System.out.println("enter you information");
		String name = employee1.next();
		int age = employee1.nextInt();
		String gender = employee1.next();
		


	if (age>=45 && gender == "male") {
		System.out.println("you are getting promotion");
	}else {
		System.out.println("you are not getting promotion");
	}
	
	
	
	
	
	
	
	}
	
	
	
	

}

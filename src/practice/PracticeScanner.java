package practice;

import java.util.Scanner;

public class PracticeScanner {
	
	public static void main(String[]args) {
	while (true){	
	Scanner input = new Scanner (System.in);	
//	 System.out.println("what is Shop Name? ");	
//	 String shopName = scan.nextLine();
//	System.out.println("Shop name: "+shopName);
//	
//	System.out.println("what is Shop Address? ");	
//	 String shopAddress = scan.nextLine();
//	System.out.println("Shop Address: "+shopAddress);		
//	
	try {	
	System.out.println("enter your age)");
	int age=input.nextInt ();
	System.out.println("eneter you : "+age);
	}catch(Exception ex) {
	System.out.println("You did not entered your age in correct format");
	
	ex. getMessage ();	
	
	}}	
		
		
	}
	
	
}
	
 


package practice;

import java.util.Scanner;

public class Student {

	// Scanner practice

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter strudent full name:");
		String studentName = scanner.nextLine();
		System.out.println("is the student Pass:");
		boolean isTheStudentPass = scanner.nextBoolean();
		System.out.println("The student: "+isTheStudentPass);
		System.out.println("Please enter student grade");
		int studentGrade = scanner.nextInt();

		System.out.println("enter your user name");
		String userName = scanner.next();
		System.out.println(""+userName);
		System.out.println("enter password");
		String password = scanner.next();
		System.out.println("" + password);
		
		if (userName.contains("@azizyafib.com")) {
			System.out.println("right username");
		} else {
			System.out.println("wrong user name your user name should contains @azizyafib.com");
		}
		if (password.length() > 6) {

			System.out.println("right password ");
		} else {
			System.out.println("wrong password try again ");
		}
		
	}

}

package practice;

public class Dog {

	// Practice the concatenation + dataType + variable

	static String dogColor = "black"; // static global variable call in the main method by the class name
	float DogHigh = 6.4f; // not static global variable call it in the main method by object

	public static void main(String[] args) {

		String dogName = "jack";
		int dogAge = 4;
		boolean isThedogOld = false;
		char dogZise = 'm';
		double dogPrice = 400.99;

		Dog myDog = new Dog();

		System.out.println("my dog high is :" + myDog.DogHigh); // by object name
		System.out.println("my dog color is :" + Dog.dogColor); // by clas name
		System.out.println("\t\t\tmy dog \"name\" is :" + dogName + "\n\t\t\tmy dog age is " + dogAge
				+ "\n\t\t\tis my dog is too old at the \'age\' 4 : " + isThedogOld);

	}
}
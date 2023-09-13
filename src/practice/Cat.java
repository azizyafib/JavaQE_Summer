package practice;

public class Cat {

	// practice commenting + block + escape sequence + dateType + variable

	private static void moaw() {

		System.out.println("this the Block practicing which is the static block will always execute first ");

	}

	/**
	 * this the main method of the cat class and also for the document practicing
	 * purpose
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String catName = "jada";
		int catAge = 4;
		boolean isTheCatOld = false;
		char catZise = 'm';
		double catPrice = 400.99;
		System.out.println("");

		System.out.println("my cat name is :" + catName + " \nmy cat age is "+catAge);
		System.out.println("this is the main method of the cat class");
		catJump(); // calling a static method by its name in the maim method
		moaw();
	}

	static {
		System.out.println(
				"\n this\t \"static block\" will execute without calling it in th main method\n and will execute before any method static or not static    ");
	}

	public static void catJump() {
		System.out.println(
				"we have to call this method in the main method \tby its name to exuste it becoaus its static method");
	}

}

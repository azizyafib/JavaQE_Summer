package constractor;

public class Player {
// constractor

	String name;
	int age;
	double salary;
	char gender;
	byte rank;

	public Player(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println(
				"player1 name:" + this.name + "\nplayer 1 age:" + this.age + "\n" + "palyer 1 salary" + this.salary);

		
	}

	public Player(String name, int age, double salary, char gender) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		System.out.println("player1 name:" + this.name + "\nplayer 2 age:" + this.age + "\n" + "palyer 2 salary"
				+ this.salary + "\nplayer 2 gender: " + this.gender);

	}

public Player() {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
//		this.rank= rank;
//		System.out.println("player3 name:" + this.name + "\nplayer 3 age:" + this.age + "\n" + "palyer  salary"
//				+ this.salary + "\nplayer 3 gender: " + this.gender+ "\nplayer  rank " + this.rank);
}
	public void playerPass() {

	}

	public static void main(String args[]) {

		Player player1 = new Player("aziz", 34, 123.500);
		player1.playerPass();
		Player player2 = new Player("mohamed", 32, 130.50, 'M');
		//Player player3 = new Player("abdou", 45, 140, 'F', byte76);
	}
}

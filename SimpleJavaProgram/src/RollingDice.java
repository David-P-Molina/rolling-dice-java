import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randNumber = new Random();
		int x = randNumber.nextInt(6) + 1;
		System.out.println("David Molina");
		System.out.println("You rolled a: " + x);
	}

}

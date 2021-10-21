package lesson8COMP132;

import java.util.Random;

public class tr2 {

	private static Random rand = new Random();

	public static void main(String[] args) {

		int number;
		try {
			number = 1000 / rand.nextInt(100);
			System.out.println(number);
		} catch (Exception e) {
			e.getStackTrace();
			
		}
	}
}

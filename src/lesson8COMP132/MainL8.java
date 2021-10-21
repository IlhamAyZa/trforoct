package lesson8COMP132;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainL8 {
	
	private static Random rand = new Random();

	public static void main(String[] args) {
		List<Integer> listOfInts = new ArrayList<>();
		
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		listOfInts.add(rand.nextInt(100));
		
		int randIdx = 1000, count = 0;
		do {
			randIdx = rand.nextInt(100);
			count++;
			System.out.println("Do list contain " + randIdx + " ? " + listOfInts.contains(randIdx));
		}while(listOfInts.contains(randIdx) == false);
		
		System.out.println(count);
		
		System.out.println("5th element: " + listOfInts.get(4));
		
		for (int i : listOfInts) {
			System.out.print(i + "  ") ;
		}
		
		System.out.printf("%nLast element:  %d%n", listOfInts.get(listOfInts.size()-1));
		
		listOfInts.stream().filter(x -> x%2 == 0).forEach(x -> System.out.print(x + "  "));
	}
}
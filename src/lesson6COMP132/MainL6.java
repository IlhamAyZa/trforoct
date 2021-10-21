package lesson6COMP132;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainL6 {
	
	private static Random rand = new Random();
//	private static List <Person> listOfPeople = new ArrayList<>();
	private static int[] arrayOfInts = {rand.nextInt(100000), -rand.nextInt(100000), rand.nextInt(100000), -rand.nextInt(100000), -rand.nextInt(100000), rand.nextInt(100000)};

	
	public static void main(String[] args) {
//		fillTheNEWListWithPeople();
//		
//		System.out.println("Just write the list: ");
//		System.out.println(listOfPeople);
//		
//		System.out.println("Using 'for' to print the list");
//		for (Person person : listOfPeople) {
//			System.out.println(person.toString());
//		}
//		
//		System.out.printf("Length of the list is %d%n%n%n", listOfPeople.size());
//		
		int totalSum =0;
		System.out.println("BEFORE: ");
		
		for (int num : arrayOfInts) {
			System.out.print(num + " ");
			totalSum += num;
		}
		
		System.out.printf("%n%d%n", totalSum);
		fillTheNEWArrayWithIntsWithRandom();
		
		totalSum = 0;
		System.out.println("AFTER :");
		
		for (int num : arrayOfInts) {
			System.out.print(num + " ");	
			totalSum += num;
		}		
		System.out.printf("%n%d%n", totalSum);
	}
	
//	private static void fillTheNEWListWithPeople() {
//		listOfPeople.clear();
//		
//		listOfPeople.add(new Person("Mike", "", 21, Gender.MALE));
//		listOfPeople.add(new Person("Klaus", "", 23, Gender.MALE));
//		listOfPeople.add(new Person("Lora", "", 17, Gender.FEMALE));
//		listOfPeople.add(new Person("Thomas", "", 32, Gender.MALE));
//		listOfPeople.add(new Person("Hila", "", 26, Gender.FEMALE));
//		listOfPeople.add(new Person("Brian", "", 19, Gender.MALE));
//		listOfPeople.add(new Person("Boris", "", 41, Gender.MALE));
//		listOfPeople.add(new Person("Mila", "", 22, Gender.FEMALE));
//		listOfPeople.add(new Person("Daria", "", 20, Gender.FEMALE));
//		listOfPeople.add(new Person("Kaan", "", 28, Gender.MALE));
//		listOfPeople.add(new Person("Lisa", "", 31, Gender.FEMALE));
//		listOfPeople.add(new Person("Sam", "", 19, Gender.MALE));
//	}
	
	private static void fillTheNEWArrayWithIntsWithRandom() {
		for (int i = 0 ; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = rand.nextInt(1000);
		}
	}
}

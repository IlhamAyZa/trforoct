package lesson8COMP132;

import java.util.ArrayList;
import java.util.Random;

public class tr1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> b = new ArrayList<>();
		int[] a = { 1, 262, 5, 626, 548, 1581, 9623, 32, 8, 2, 34, 85 };
		int[][] c = {{26, 98, 44},{77, 12},{199, 43},{21, 23},{99}};
		
		b.add(345);
		b.add(456);
		System.out.println(b);
		b.forEach(x -> System.out.print(x +" "));
		
		for (int integ : a) {
			b.add(integ);
		}

		System.out.printf("%n%n");
		System.out.println(b);
		b.forEach(x -> System.out.print(x +" "));
	
		for (int[] integArr : c) {
			for(int integ : integArr) {
				b.add(integ);
			}
		}

		System.out.printf("%n%n");
		System.out.println(b);
		b.forEach(x -> System.out.print(x +" "));
		
	}
}
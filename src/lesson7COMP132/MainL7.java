package lesson7COMP132;

import java.util.Random;
import java.util.Scanner;

public class MainL7 {

	private static Random rand = new Random();
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.print("Enter matrix sizes: ");
//		int[][] matrix = new int[scn.nextInt()][scn.nextInt()];
//		
//		int[][] array = {{1,2,3},{11,12,13}}; 
//		System.out.println(array.length);
//
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				matrix[i][j] = rand.nextInt(100);
//			}
//		}
//		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.print("| ");
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("|");
		}
	}
}
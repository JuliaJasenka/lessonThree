package edu.training.simpleapptwo.main;
/*
 *  Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Целое число N является четным двузначным числом.
 */

public class Main12_1 {

	public static void main(String[] args) {
		int N = 2;

		if ((N%2)==0 & N >= 10 & N <= 99) {
			System.out.println("условие выполняется - true");
		} else {
			System.out.println("условие не выполняется - false");
		}

	}

}

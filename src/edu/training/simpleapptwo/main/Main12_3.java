package edu.training.simpleapptwo.main;
/*
 * 12. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Сумма цифр данного трехзначного числа N является четным числом.
 */

public class Main12_3 {

	public static void main(String[] args) {
		int a = 138;
		int sum = 0;

		for (int i = 0; i < 3; i++) {

			sum += a % 10;
			a = a / 10;
		}
		if (sum % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}

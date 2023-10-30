package edu.training.simpleapptwo.main;
/*
 * . Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
 */

public class Main12_5 {

	public static void main(String[] args) {
		int n = 131;

		double a = Math.pow(n, 2);

		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += n % 10;
			n = n / 10;
		}

		double z = Math.pow(sum, 3);

		if (a == z) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

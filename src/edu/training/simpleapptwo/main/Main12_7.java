package edu.training.simpleapptwo.main;

/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
 */
public class Main12_7 {

	public static void main(String[] args) {
		int n = 231;

		int a = n % 10;
		int b = (n / 10) % 10;
		int c = (n / 100);

		if ((b + c) == a || (a + b) == c || (a + c) == b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

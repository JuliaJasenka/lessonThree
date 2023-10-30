package edu.training.simpleapptwo.main;
/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п)
 */

public class Main12_9 {

	public static void main(String[] args) {

		double a = 1;
		double b = 7;
		double c = 1;
		double x = 7;
		double y = 99;
		

		double y1 = a * Math.pow(x, 2) + b * x + c;

		if (y == y1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

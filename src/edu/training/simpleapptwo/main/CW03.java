package edu.training.simpleapptwo.main;

/*
 * Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что
а≠0 и что дискриминант уравнения неотрицателен).
 */
public class CW03 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double x1;
		double x2;

		a = 2;
		b = 3;
		c = 4;

		double D = Math.pow(b, 2) - 4 * a * c;

		if (D < 0) {
			System.out.println("Корней нет");
			return;
		}

		if (D == 0) {
			x1 = (-b / (2 * a));
			System.out.println("x = " + x1);
			return;
		}

		x1 = ((-b + Math.sqrt(D)) / (2 * a));
		x2 = ((-b + Math.sqrt(D)) / (2 * a));

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}

}

package edu.training.simpleapptwo.main;

/*
 *  Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а^8 за три 
 *  операции и а^10 за четыре операции.
 */
public class Main04 {

	public static void main(String[] args) {

		int a = 2;

		a = 2 * 2;
		a = a * 4;
		a = a * 16;// a^8

		System.out.println("a в восьмой степени равно " + a);

		int b = 2;

		int b1 = 2 * 2;
		int b2 = b1 * 4;
		int b3 = b2 * b;
		b = b3 * 32;// b^10

		System.out.println("b в восьмой степени равно " + b);

		// или через цикл

		int n = 2; // число, которое возводится в степень
		int d = 10;// степень числа
		int i;
		int tmp = n;

		if (d == 0) {
			System.out.println("Степень числа не может равняться нулю");
			return;
		}
		
		for (i = 1; i < d; i++) {

			n *= tmp;
			
		}
		System.out.println("n в степени d равно " + n);
	}

}

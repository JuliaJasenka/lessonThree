package edu.training.simpleapptwo.main;

/*
 * Найти частное произведений четных и нечетных цифр четырехзначного числа
 */
public class Main11 {

	public static void main(String[] args) {

		int a = 1234;
		int prCh = 1;
		int prNch = 1;

		while (a != 0) {

			if ((a % 10) % 2 == 0) {
				prCh *= a % 10;
			} else {
				prNch *= a % 10;
			}
			a = a / 10;
		}

		double quot = (double)prCh /(double) prNch;

		System.out.println("произведение четных цифр числа а равно " +prCh);
		System.out.println("произведение нечетных цифр числа а равно "+prNch);
		System.out.println("частное произведений четных и нечетных цифр числа а равно "+quot);
	}

}

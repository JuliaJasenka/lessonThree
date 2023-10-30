package edu.training.simpleapptwo.main;

/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4)
 */
public class Main12_8 {

	public static void main(String[] args) {

		int a = 3;
		int N = 5;

		if (0 < N & N < 4) {

			System.out.println("true");
		}

		else {
			System.out.println("false");
		}

	}

}

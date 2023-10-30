package edu.training.simpleapptwo.main;
/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Треугольник со сторонами а,b,с является равнобедренным.
 */
public class Main12_6 {

	public static void main(String[] args) {
		int ab=5;
		int bc=5;
		int ac=3;
		
		if (ab==bc) {
			System.out.println("true. Треугольник является равнобедренным со стороной равной " +ab);
			
		}
		else {
			System.out.println("false. Треугольник не является равнобедренным");
		}
	}

}

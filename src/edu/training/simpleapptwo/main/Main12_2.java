package edu.training.simpleapptwo.main;
/*
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних циф
 */

public class Main12_2 {

	public static void main(String[] args) {
		int n=2342;
		
		int a = n / 1000;
		int b = n / 100 % 10;
		int c = n % 100 / 10;
		int d = n % 1000 % 10;
		
		if((a + b) == (c + d)){
			
			System.out.println("true");
		}else
			System.out.println("false");
		
		
		
	

	}

}

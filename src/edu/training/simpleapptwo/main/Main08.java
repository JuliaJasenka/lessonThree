package edu.training.simpleapptwo.main;
/*
 *  Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
 */

public class Main08 {
	public static void main(String[] args) {

		char currentSymbol= 'B';
		char previousSymbol = (char)(currentSymbol-1);
		char nextSymbol = (char)(currentSymbol+1);
		
		System.out.println(currentSymbol);
		System.out.println(previousSymbol);
		System.out.println(nextSymbol);
	}

}

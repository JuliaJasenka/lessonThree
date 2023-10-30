package edu.training.simpleapptwo.main;
/*
 *  Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения 
информации
 */
public class Main09 {

	public static void main(String[] args) {
		
		double A = 8;
		
		double KB=A/Math.pow(2,10);
		double MB=A/Math.pow(2,20);;
		double GB=A/Math.pow(2,30);;
		double TB=A/Math.pow(2,40);;
		
		System.out.println(A+" Байт равно "+KB +" Килобайт");
		System.out.println(A+" Байт равно "+MB +" Мегабайт");
		System.out.println(A+" Байт равно "+GB +" Гигабайт");
		System.out.println(A+" Байт равно "+TB +" Терабайт");
	}

}

package edu.training.simpleapptwo.main;

/*
 * Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */

public class Main05 {

	public static void main(String[] args) {
		double rad = 90;
		

		 double grad = (rad * 180) / Math.PI;// перевод из радиан в градусы

				
		double min = (grad * 60)% 60;

		System.out.println(min);
	}

}

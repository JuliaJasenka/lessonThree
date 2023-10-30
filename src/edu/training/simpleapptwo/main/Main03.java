package edu.training.simpleapptwo.main;

/*
 * Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у
 */

public class Main03 {

	public static void main(String[] args) {

		double a = 6;
		double b = 8;
		double y = 30;

		double S = ((a * b) / 2) * Math.sin(Math.PI * (y / 180));

		System.out.println("Площадь треугольника равна " + S);

	}

}

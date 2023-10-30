package edu.training.simpleapptwo.main;

public class CW02 {

	public static void main(String[] args) {

		double d = 123.456;

		System.out.println((int) d / 1000.0);
		double a = (int) d / 1000.0;

		System.out.println((int) ((d - (int) d) * 1000));
		double b = (int) ((d - (int) d) * 1000);

		System.out.println(a + b);
	}

}

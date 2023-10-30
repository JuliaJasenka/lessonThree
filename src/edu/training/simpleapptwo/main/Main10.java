package edu.training.simpleapptwo.main;

/*
 * Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
 */
public class Main10 {

	public static void main(String[] args) {
		double M = 450;
		double N = 37;
		double C = M / N;

		int d = (int) C % 10;
		int f = (int) (C * 10) % 10;

		System.out.println("частное от деления М на N: " + C);
		System.out.println("младшая цифра целой части: " + d);
		System.out.println("старшая цифра дробной части:" + f);

	}

}

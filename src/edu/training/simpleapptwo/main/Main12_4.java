package edu.training.simpleapptwo.main;
/*Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и 
false — в противном случае:
• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п)
*/

public class Main12_4 {

	public static void main(String[] args) {

		int a = 8;
		int t = 7;
		int p = 18;

		if (t < a & a < p) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}

}

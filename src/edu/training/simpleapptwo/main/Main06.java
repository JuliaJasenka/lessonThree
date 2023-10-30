package edu.training.simpleapptwo.main;

/*
 * Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с
 */
public class Main06 {

	public static void main(String[] args) {
		double a = 13;
		double b = 20;
		double c = 17;
		
		double cosA = (Math.pow(c, 2)+Math.pow(b, 2)-Math.pow(a, 2))/(2*b*c);// cos угла А
		double cosB = (Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*a*b);// cos угла B
		double cosC = (Math.pow(a, 2)+Math.pow(c, 2)-Math.pow(b, 2))/(2*a*c);// cos угла C
		
		double radA= Math.acos(cosA);// угол А в радианах
		double radB= Math.acos(cosB);// угол В в радианах
		double radC= Math.acos(cosC);// угол С в радианах
		
		double degA= Math.toDegrees(radA);
		double degB= Math.toDegrees(radB);
		double degC= Math.toDegrees(radC);
		
		System.out.println("угол А треугольника со сторонами a,b,c равен " + radA + " радиан " + degA + " градусов");
		System.out.println("угол B треугольника со сторонами a,b,c равен " + radB + " радиан " + degB + " градусов");
		System.out.println("угол C треугольника со сторонами a,b,c равен " + radC + " радиан " + degC + " градусов");
	}

}

package edu.training.simpleapptwo.main;
/*
 * Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать 
часы через р ч q мин r с?
 */

public class Main07 {

	public static void main(String[] args) {
		int hour = 2;
		int minute = 23;
		int second = 36;

		int hourPassed = 1;
		int minutePassed = 1;
		int secondPassed = 1;

		if (hourPassed < 0 || hourPassed > 23) {
			System.out.println("Часы должны быть от 0 до 23: " + hourPassed);
			return;
		}
		if (minutePassed < 0 || minutePassed > 59) {
			System.out.println("Минуты должны быть от 0 до 59: " + minutePassed);
			return;
		}

		if (secondPassed < 0 || secondPassed > 59) {
			System.out.println("Секунды должны быть от 0 до 59: " + secondPassed);
			return;
		}
		int secondsInHour = 3600;
		int secondsInMinute = 60;

		int secTotal = second + minute * secondsInMinute + hour * secondsInHour;
		int secPassedTotal = secondPassed + minutePassed * secondsInMinute + hourPassed * secondsInHour;
		int currentSecTotal = secTotal + secPassedTotal;

		int currentHour = currentSecTotal / secondsInHour;
		currentSecTotal = currentSecTotal % secondsInHour;
		int currentMinute = currentSecTotal / secondsInMinute;
		int currentSecond = currentSecTotal % secondsInMinute;

		System.out.println("Текущее показание: " + hour + "ч " + minute + "м " + second + "с ");
		System.out.println("Показание часов через р ч q мин r с: " + currentHour + "ч " + currentMinute + "м " + currentSecond + "с ");
	}

}

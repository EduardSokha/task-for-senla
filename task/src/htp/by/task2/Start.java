package htp.by.task2;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		int num1 = enter("Введите первое число");
		int num2 = enter("Введите второе число");
		int number = num1;
		int number2 = num2;

		int c = number % number2;
		while (c != 0) {
			number = number2;
			number2 = c;
			c = number % number2;
		}
		System.out.println("НОД = " + number2);
		
		int lcm = num1*num2/number2;
		System.out.println("НОК = " + lcm);
	}

	public static int enter(String message) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println(message);

		while (sc.hasNextInt() == false) {
			String in = sc.next();
			System.out.println("not int");
			System.out.println("enter int");
		}
		number = sc.nextInt();
		return number;
	}
}
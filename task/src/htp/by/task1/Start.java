package htp.by.task1;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		int number = enter("Введите целое число");
		if (number % 2 == 0) {
			System.out.println("Четное, составное");
			return;
		} else {
			  for (int i = 2; i < number; i++) {
		            if (number % i == 0) {
		            	System.out.println("Не четное, составное");
		            	return;
		            }
		        }
			System.out.println("Не четное, простое");
		}

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

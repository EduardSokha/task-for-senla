package htp.by.task5;

import java.util.Scanner;

public class Start {

	public static String[] token(int numbers) {

		String[] numText = new String[numbers];

		for (int i = 0; i < numbers; i++) {
			numText[i] = i + "";
		}

		return numText;
	}

	public static void toCheckPalindromNumber(String[] nums) {

		for (int i = 0; i < nums.length; i++) {
			try {

				int a = Integer.parseInt(nums[i]);

				if (checkNumbers(a)) {
					System.out.println("„исло " + a + " €вл€етс€ палиндромом");
				}
			} catch (NumberFormatException e) {

				try {
					double b = Double.parseDouble(nums[i]);

					if (checkNumbers(b)) {
						System.out.println("„исло " + b + " €вл€етс€ палиндромом");
					}

				} catch (NumberFormatException f) {
					System.out.println(
							"¬веденное вами выражение '" + nums[i] + "' не €вл€етс€ целым или вещественным числом");
				}
			}
		}
	}

	public static boolean checkNumbers(int num) {
		char[] x = String.valueOf(num).toCharArray();
		boolean check = true;
		for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {
			if (x[i] == x[j]) {
				check = true;
			} else {
				return false;
			}
		}
		return check;
	}

	public static boolean checkNumbers(double num) {
		char[] x = String.valueOf(num).toCharArray();
		boolean check = true;
		for (int i = 0, j = x.length - 1; i < x.length; i++, j--) {
			if (x[i] == x[j]) {
				check = true;
			} else {
				return false;
			}
		}
		return check;
	}

	public static void main(String[] args) {

		System.out.println("¬ведите необходимое количество чисел");
		System.out.println("¬ведите все числа в одну строку раздел€€ зап€той");
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		int number = Integer.parseInt(numbers);
		String[] a = token(number);
		toCheckPalindromNumber(a);
	}
}

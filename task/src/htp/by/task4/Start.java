package htp.by.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите слова одной строкой через пробел");
		String input = sc.nextLine();
		System.out.println("¬ведите слово");
		String input2 = sc.nextLine();

		String[] split = input.replaceAll("[-.?!)(,:]", "").split(" ");
		List<String> arr = Arrays.asList(split);

		for (String word : arr) {
			String word1 = word.toUpperCase();
			System.out.print(word1 + " ");
			if (word.equals(input2)) {
				++count;
			}
		}		
		System.out.println("\n" + "Amount = " + count);
	}

}
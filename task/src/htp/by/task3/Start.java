package htp.by.task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слова одной строкой через пробел");
		String input = sc.nextLine();
		
		String[] split = input.split(" ");
		List<String> arr = Arrays.asList(split);
		System.out.println("\n" + "Amount = " + arr.size());
		
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});		
		System.out.println("\n" + arr + "\n");
		
		for (String word : arr) {
			String word1 = word.substring(0, 1).toUpperCase() + word.substring(1);
			System.out.print(word1 + " ");
		}			
	}
}

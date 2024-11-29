package bookExercises;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		int sum = 0;

		Scanner scan = new Scanner(System.in);

		String userAnswer;

		do {

			for (int i = 0; i < numbers.length; i++) {

				System.out.println("Input index: " + i);

				numbers[i] = scan.nextInt();

				sum += numbers[i];

			}

			if (sum % 2 == 1) {

				System.out.println("Sum = " + sum);

			}

			else {

				for (int i = 0; i < numbers.length; i++) {

					System.out.print(numbers[i] + " ");

				}
			}

			System.out.println("Do You Want To Continue? (yes/no)");

			userAnswer = scan.next();

		} while (userAnswer.equalsIgnoreCase("yes"));

		System.out.println("End of application!!");

		scan.close();

	}

}

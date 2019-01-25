package lab8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CallThemOut {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		// TODO make 3 arrays (name, hometown, favorite food, at 7 students
		String[] stuNames = { "Cynthia", "Suncenray", "Mariah", "Michael", "David", "Dereq", "Chiquita" };
		String[] homeTown = { "Detroit", "Sweden", "Miami", "Paris", "Lagos", "Syndey", "Nairobi" };
		String[] favoriteFood = { "Cornbeef Eggrolls", "Janssons frestelse", "Tacos", "Crossaints", "Jollof Rice",
				"Vegmite", "Wali wa Nazi" };
		int choice = 0;

		while (true) {
			try {
				try {
					// Prompt the user about the student selection
					System.out.println("Welcome to Java class! Which student would you like to learn more about? "
							+ "(Enter a number between: 1-7):");
					choice = userInput.nextInt();
					userInput.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("This is not a number");
					userInput.nextLine();
					continue;
				}
				System.out.println(stuNames[choice - 1]);
				// Find student's info
				// first find student's name
				// then ask if they want to find out about
				System.out.println("The student number " + (choice) + " is " + stuNames[choice - 1] + "!");
				break;

			} catch (IndexOutOfBoundsException e) {
				System.out.println("This student does not exist. Please try again. (enter number: 1-7): ");

			}
		}

		boolean again = true;

		do {
			while (true) {
				System.out.println("What would you like to know about " + stuNames[choice - 1]
						+ "? (enter 'hometown' or " + "'favoritefood')");
				String wannaKnow = userInput.nextLine();

				try {
					Question(wannaKnow, stuNames, homeTown, favoriteFood, choice);
					break;
				} catch (IllegalArgumentException e) {
					System.out.println("This is not a word. Try Again.");
				}
			}
			System.out.println("Would you like to know more? (enter 'yes' or 'no'):");
			String answer = userInput.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				continue;
			} else {
				again = false;
			}

		} while (again);
		System.out.println("Thanks!");
	}

	public static void Question(String input, String[] stuNames, String[] homeTown, String[] favoriteFood, int choice) {

		if (input.equalsIgnoreCase("hometown")) {
			System.out.println(stuNames[choice - 1] + " is from " + homeTown[choice - 1] + "!");

		} else if (input.equalsIgnoreCase("favoritefood")) {
			System.out.println(stuNames[choice - 1] + " favorite food is " + favoriteFood[choice - 1] + "!");

		} else {
			System.out.println("That data does not exist.");

		}
	}
}
//		String more = "y";
//		if (more.equalsIgnoreCase("y")) {
//
//			System.out.println(favoriteFood[choice - 1]);
//
//		} else {
//			System.out.println("W");
//
//		}
//
//		if (more.equalsIgnoreCase("y")) {
//
//		} else {
//			System.out.println("Wow! You were so nosey!");

// hometown or favorite food, then print it
// ask if they would like to find out about another student

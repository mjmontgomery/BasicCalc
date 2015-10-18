/**
  This Program is a simple very basic calculator.
 * The user can put in two values and get an answer in all 4 operations.
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args)

	{
		boolean stop = false;
		Scanner userInput = new Scanner(System.in);
		while (!stop) {

			System.out.println("What Do You want to do? Enter a Number for the operation. Addition[1]?, Subtraction[2]?, Multiplication[3] or Division[4]?");
			int mainInput;
			Double firstNum, secondNum, answer, again;
			mainInput = userInput.nextInt();

			if (mainInput == 1) {
				System.out.println("You chose addition. Enter Your First Number.");
				firstNum = userInput.nextDouble();
				System.out.println("Enter Your Second Number.");
				secondNum = userInput.nextDouble();
				answer = firstNum + secondNum;
				System.out.println("Your answer is:");
				System.out.println(answer);
				System.out.println("Thanks For Using Our Software!");

			} else if (mainInput == 2) {
				System.out
						.println("You chose subtraction. Enter Your First Number.");
				firstNum = userInput.nextDouble();
				System.out.println("Enter Your Second Number.");
				secondNum = userInput.nextDouble();
				answer = firstNum - secondNum;
				System.out.println("Your answer is:");
				System.out.println(answer);
				System.out.println("Thanks For Using Our Software!");

			} else if (mainInput == 3) {
				System.out
						.println("You chose multiplication. Enter Your First Number.");
				firstNum = userInput.nextDouble();
				System.out.println("Enter Your Second Number.");
				secondNum = userInput.nextDouble();
				answer = firstNum * secondNum;
				System.out.println("Your answer is:");
				System.out.println(answer);
				System.out.println("Thanks For Using Our Software!");

			}

			else if (mainInput == 4) {
				System.out
						.println("You chose division. Enter Your First Number.");
				firstNum = userInput.nextDouble();
				System.out.println("Enter Your Second Number.");
				secondNum = userInput.nextDouble();
				answer = firstNum / secondNum;
				System.out.println("Your answer is:");
				System.out.println(answer);
				System.out.println("Thanks For Using Our Software!");

			}

			else {
				System.out.println("Error. Please Try Again.");
			}

			System.out.println("Want to run again, Yes = 1 or No = 2 ?");
			int s = userInput.nextInt();
			if (s == 2) {
				stop = true;
				System.out.println("Goodbye ;)");

			}

		}

	}
}

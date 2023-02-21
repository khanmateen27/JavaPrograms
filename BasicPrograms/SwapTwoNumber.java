//Swap Two Number using third variable

import java.util.Scanner;
class SwapTwoNumber{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second Number: ");
		int secondNumber = sc.nextInt();
		int swap = 0;

		System.out.println("The Value of First Number and Second Number Before Swaaping is: " + firstNumber + " " + secondNumber);

		swap = firstNumber;
		firstNumber = secondNumber;
		secondNumber = swap;

		System.out.println("The Value of first Number and second Number after Swapping is: " + firstNumber + " " + secondNumber);
	}
}
//Prime Number in Java

import java.util.Scanner;
class PrimeNumber{

	public static void main(String args[]){
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();

		for(int i = 2 ; i <= number/2 ; i++){
			if(number % i == 0){
				isPrime = false;
			}
		}
	if(isPrime){
		System.out.println(number + " is a Prime Number");
	}

	else{
		System.out.println(number + " is not a Prime Number");
	}
}
}
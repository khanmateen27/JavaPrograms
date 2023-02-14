//10.	WAP to accept a number and display sum of its digits.
import java.util.Scanner;
class SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number: ");
            int number = sc.nextInt();
            int temp = number;
            int sum = 0;
            while(temp != 0){
                int lastDigit = temp % 10;
                sum += lastDigit;
                temp /=10;
            }
            System.out.print("The Sum of the digits is: "+sum);
            System.out.println();
            sc.close();
        }
    }
}
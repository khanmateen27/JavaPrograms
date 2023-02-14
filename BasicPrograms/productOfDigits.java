//11.	WAP to accept a number and display product of digits.
import java.util.Scanner;
class productOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the Number to Display product of the Digits: ");
        int number = sc.nextInt();
        int product = 1;
        int temp = number;
        while(temp != 0){
            int lastDigit = temp % 10;
            product = product * lastDigit;
            temp /= 10;
        }
        System.out.println("The product of the Digits of the Number is: " + product);
        sc.close();
        }
    }
}
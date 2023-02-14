//13.	WAP to accept a number and display it is a Palindrome number or not.
import java.util.Scanner;
class checkingPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number: ");
            int number = sc.nextInt();
            int palin = 0;
            int temp = number;
            while(temp != 0){
                int lastDigit = temp % 10;
                palin = (palin * 10) + lastDigit;
                temp = temp / 10;
            }
            if(number == palin){
                System.out.println(number + " is a palindrome Number");
            }
            else{
                System.out.println(number + " is not a palindrome Number");
            }
            sc.close();
        }
    }
}
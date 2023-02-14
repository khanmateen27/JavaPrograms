//12.	WAP to accept a number and display Reverse number.
import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number: ");
            int number = sc.nextInt();
            int temp = number;
            int rev = 0;
            while(temp != 0){
                int lastDigit = temp % 10;
                rev = (rev * 10) + lastDigit;
                temp /= 10;
            }
            System.out.println("The Reverse Number is: " + rev);
            sc.close();
        }
    }
}
//9.	WAP to accept a number and display total digits in it.
import java.util.Scanner;
class TotalDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number to count the totalDigits in a Number: ");
            int number = sc.nextInt();
            int temp = number;
            int totalDigits = 0;
            while(temp != 0){
                temp = temp / 10;
                totalDigits++;
            }
            System.out.println("The Total Digits in a Number is: " + totalDigits);
            sc.close();
        }
    }
}
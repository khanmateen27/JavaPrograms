//14.	WAP to accept a number and display it is an Armstrong number or not.
import java.util.Scanner;
class checkingArmstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number to check whether the Number is Armstrong or not: ");
            int number =  sc.nextInt();
            int arm = 0;
            int count = 0;
            int temp = number;

            //counting the Number of Digits
            while(temp != 0){
                temp = temp / 10;
                count++;
            }
            temp = number;
            
            //checking for the Armstrong Number
            while(temp != 0){
                int lastDigit = temp % 10;
                arm = arm + (int)Math.pow(lastDigit , count);
                temp /= 10;
            }

            //Checking the Conditions
            if(number == arm){
                System.out.println("The Number is an Armstrong Number");
            }
            else{
                System.out.println("The Number is not an Armstrong Number");
            }
            sc.close();
        }
    }
}
//15.	WAP to accept a number and display it is an Automorphic number or not.
import java.util.Scanner;
class checkingAutomorphic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number: ");
            int number = sc.nextInt();
            int count = 0;
            int temp = number;

            //counting the Digits of the Number
            while(temp != 0){
                temp /= 10;
                count++;
            }

            //Checking for the Automorphic Number
            int sq = number * number;
            int lastDigit = sq % (int)Math.pow(10 , count);

            if(lastDigit == number){
                System.out.println(number + " is an Automorphic Number");
            }
            else{
                System.out.println(number + " is not an Automorphic Number");
            }
        }
    }
}
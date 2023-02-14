//6.	WAP to accept two numbers and display all numbers from first number till last number. (First number can be greater or less than second number).
import java.util.Scanner;
class DisplayAllNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the First Number: ");
            int number1 = sc.nextInt();
            System.out.println("Enter the second Number: ");
            int number2 = sc.nextInt();

            if(number1 < number2){  //If the Number1 is Less than Number2
                for(int i = number1 ; i <= number2 ; i++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            if(number1 > number2){  //If Number2 is Greater than Number1
                for(int i = number1 ; i >= number2 ; i--){
                    System.out.print(i + " ");
                    }
                    System.out.println();
            }
            sc.close();
        }
    }
}
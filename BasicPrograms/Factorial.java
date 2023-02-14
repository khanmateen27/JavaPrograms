//5.	WAP to accept a number and display its Factorial.
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number to Find The Factorial");
            int number = sc.nextInt();
            int fact = 1;
            for(int i = 1 ; i <= number ; i++){
                fact = fact * i;
            }
            System.out.println("The Factorial Of a Number "+ number + " is: " + fact);
            sc.close();
        }
    }
}

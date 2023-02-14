//7.	WAP to accept a number and display its table.
import java.util.Scanner;
public class DisplayTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Number to print its Table: ");
            int number = sc.nextInt();
            System.out.println("The Table is as follows: ");
            for(int i = 1 ; i <= 10 ; i++){
                System.out.println(number + " x " + i + " : "+ number * i);
            }
            sc.close();
        }
    }
}

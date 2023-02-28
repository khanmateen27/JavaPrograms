// Counting Occurences
// 536787347..... eg:-[Find out the Number of time 7 came into the series]
import java.util.Scanner;
public class Occurences{
    public static void main(String args[]){
        System.out.println("Enter The Number Series");
        Scanner num = new Scanner (System.in);
        int number = num.nextInt();
        System.out.println("Enter The Number to count its occurence");
        int occur = num.nextInt();
        int counter = 0;
        while(number != 0){
            //Taking out the last digit from the number series
                int last_digit = number % 10;
                if(last_digit == occur){
                    counter += 1 ;
                    number = number / 10;
                }
                else {
                    number = number / 10;
                }
        }
        System.out.println(counter + " times the digit occured in the number series!");

    }
}
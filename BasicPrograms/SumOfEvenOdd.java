//4.	WAP to accept a number and display sum of all even numbers and odd numbers separately from 1 to that number.
import java.util.Scanner;
class SumOfEvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a Ending Number for the Range");
            int number = sc.nextInt();
            int oddSum = 0 ;
            int evenSum = 0;

            for(int i = 1 ; i <= number ; i++){
                if(i % 2 == 0){//Even Number
                    evenSum += i;
                }
                else{//OddNumber
                    oddSum +=i;
                }
            }
            System.out.println("The Sum of Even Numbers is: "+evenSum);
            System.out.println("The Sum of Odd Numbers is: " + oddSum);
            sc.close();
        }
    }
}
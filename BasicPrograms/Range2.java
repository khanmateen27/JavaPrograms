//•	1 2 4 8 16 32 64 128 256 …………………………………200
import java.util.Scanner;
class Range2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Number for a Range: ");
        int startingRange = sc.nextInt();
        System.out.println("Enter Second Number for a Range: ");
        int secondRange = sc.nextInt();
        System.out.println("The Range is: ");
        System.out.print(startingRange + " ");
        System.out.print(secondRange + " ");
        for(int i = secondRange ; i <= 200 ; i=i * 2){
            System.out.print(i + " ");
        }
    }
}
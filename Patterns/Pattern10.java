package Patterns;
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the Value of n: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            //for spaces
            for(int j = 1 ; j <= i-1 ; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*

****
 ***
  **
   *

 */
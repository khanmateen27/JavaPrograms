package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        //pattern 1
        for(int i = 1 ; i <= 5 ; i++){
            //for space
            for(int j = 1; j <= 5-i ; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern 2
        for(int i = 1 ; i <= 4 ; i++){
            //for space
            for(int j = 1 ; j <= i-1+1 ; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1 ; j <= 4-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
         *
        **
       ***
      ****
     *****
      ****
       ***
        **
         *
 */ 
package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5-i+1 ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
/*
    1 1 1 1 1 
    2 2 2 2 
    3 3 3
    4 4
    5
    
 */
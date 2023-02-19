package Strings;
import java.util.Scanner;
public class LowerToUpper {
    private static Scanner sc;
	public static void main(String[] args) {
		String lowStr;
		
		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Lowercase String =  ");
		lowStr = sc.nextLine();
	
		String lowStr2 = lowStr.toUpperCase();	
		System.out.println("\nThe Uppercase String  =  " + lowStr2);
    }
}

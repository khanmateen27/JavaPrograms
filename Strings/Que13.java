/*
13. WAP to accept a String and display each word in reverse. 
For eg if String is “Ram is a good Boy” 
Then output should be maR si a doog yoB 
*/

import java.util.Scanner;
class Que13{
	public static void main(String []ar){
		System.out.print("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("Original String is: " + str);
		String [] words = str.split(" ");
		String output = "";
		for(String word : words){
				String revWord = ""	;
			for(int i = word.length()-1; i>=0 ; i--){
					revWord = revWord + word.charAt(i);
					}
				output = output + revWord + " ";
			}
		System.out.print("Reversed Word String is: "+ output);
		}
}
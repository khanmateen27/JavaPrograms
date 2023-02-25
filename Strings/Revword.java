/* 
import java.util.Scanner;
class RevWord{
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String [] words = str.split(" ");
        String reversedWord = "";

        for(String word : words){

            String revWord = "";
            for(int i = word.length()-1 ; i>=0 ; i--){
                revWord = revWord + word.charAt(i);
            }
            reversedWord = reversedWord + revWord + " ";
        }

        System.out.println(reversedWord);
        in.close();

    }
} */

//4. WAP to accept a String and diplay words in reverse order. 
//For eg if String is “Ram is a good Boy” 
//Then output should be Boy good a is Ram 

import java.util.Scanner;
class RevWord{
	public static void main(String []ar){
		System.out.println("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = str.split(" ");
		String result = "";
	for(int i = arr.length -1 ; i>=0 ; i--){
			result = result + arr[i] + " ";
			}
	System.out.println(result);
	in.close();
		}
}
// Java Program to convert lower-case characters to Upper-Case & Vice-Versa
package Strings;
import java.util.Scanner;
class ConvertCharacter{

	static void convertOpposite(StringBuffer str){

		int len = str.length();

		for(int i = 0 ; i < len ; i++){

			Character c = str.charAt(i);

		if(Character.isLowerCase(c)){

			str.setCharAt(i , Character.toUpperCase(c));
		}

		else{

			str.setCharAt(i , Character.toLowerCase(c));
		}

	}

	System.out.println(str);
	}


	public static void main(String args[]){

		StringBuffer str = new StringBuffer("CloudTech");
		convertOpposite(str);

	}

}
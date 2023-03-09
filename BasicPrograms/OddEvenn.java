import java.util.Scanner;
class OddEvenn
{
	public static void main(String args[])
{
	int num = 0;

	System.out.println("Enter a Number");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	

	if(num % 2 == 0)
{
	System.out.println("The Number is Even. "+ num);
}

	else 
{
	System.out.println("The Number is odd."+ num);
}
}
}
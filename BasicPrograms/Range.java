//• Question (8)
//	1 4 7 10 13 16 19 22 25 …………………………………..200
import java.util.Scanner;
class Range{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Starting Number for a Range: ");
        int startingNumber = sc.nextInt();
        System.out.println("The Range is: ");
        for(int i = startingNumber ; i<=200 ; i = i+3){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
/*
    Output is : The Range is:
1 4 7 10 13 16 19 22 25 28 31 34 37 40 43 46 49 52 55 58 61 64 67 70 73 76 79 82 85 88 
91 94 97 100 103 106 109 112 115 118 121 124 127 130 133 136 139 142 145 148 151 154 157 160 163 
166 169 172 175 178 181 184 187 190 193 196 199
 */
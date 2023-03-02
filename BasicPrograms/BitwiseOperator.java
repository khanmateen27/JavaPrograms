// Bitwise Operators in Java

class BitwiseOperator{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        //--> Bitwise OR Operator (|)
            System.out.println(a | b);
        //--> Bitwise AND Operator (&)
            System.out.println(a & b);
        //--> Bitwise XOR Operator (^)
            System.out.println(a ^ b);
        //--> Bitwise Compliment Operator (~)
            System.out.println(~9);
        //Shifting Techniques
            //Left SHIFT BY 1
            System.out.println(a << 1);
            //Left SHIFT BY 2
            System.out.println(a << 2);
            //Right Shift BY 1
                System.out.println(a >> 1);
            //Right Shift by 2
                System.out.println(a >> 2);
    }
}
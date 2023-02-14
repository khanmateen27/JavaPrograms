//2.	WAP to display all even numbers from 2 to 200.
public class DisplayEvenNumbers {
    public static void main(String args[]){
        int i = 2 ;
        while(i <= 200){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

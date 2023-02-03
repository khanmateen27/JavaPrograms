import java.util.Scanner;
public class LastRepeatedValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements in an array: ");
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The last repeated value is: ");
        int lastRepeatedValue = -1;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    lastRepeatedValue = arr[i];
                }
            }
        }
        System.out.println(lastRepeatedValue);
    }
}
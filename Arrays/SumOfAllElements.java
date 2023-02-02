import java.util.Scanner;
public class SumOfAllElements {

    static int sizeOfArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArrays(int sizeOfArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an Array: ");
        int arr[] = new int[sizeOfArray];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void displayArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    static void sumOfArrayElements(int arr[]){
        int sumOfArray = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sumOfArray += arr[i];
        }
        System.out.println("Sum of array Elements is: " + sumOfArray);
    }

    /*             Main Method in Java                               */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sizeOfArray();
        int arr[] = inputArrays(sizeOfArray);
        sumOfArrayElements(arr);
    }

}

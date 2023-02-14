import java.util.Scanner;
public class LeftRotateByOne {
    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void leftRotateByOne(int[] arr , int size){
        int n = size;
        int temp = arr[0];
        for(int i = 1 ; i < n ; i++){
            arr[i-1] = arr[i];
        } 
        arr[n-1] = temp;

        //printing elements 
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int size = inputSize();
        int arr[] = inputArray(size);
        leftRotateByOne(arr , size);
    }
}
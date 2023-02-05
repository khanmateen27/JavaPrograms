import java.util.Scanner;
public class SortedArray {
    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array:");
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    /*
    //Method 1 [TC ---> O(n^2)]
    static boolean sortedArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    } */

    //Method 2 [TC ----> O(n)]
    static boolean sortedArray(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int size = inputSize();
        int arr[] = inputArray(size);
        boolean sorted = sortedArray(arr);
        System.out.println(sorted);
    }
    
}

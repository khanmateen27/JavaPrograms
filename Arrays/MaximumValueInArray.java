import java.util.Scanner;

public class MaximumValueInArray {
    static int sizeOfArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = in.nextInt();
        in.close();
        return size;
    }
    static int[] inputArray(int size){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements in an Array: ");
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }
    static void maxValueInArray(int[] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The Maximum value in array is: " + max);
    }

    public static void main(String args[]){
        int size = sizeOfArray();
        int arr[] = inputArray(size);
        maxValueInArray(arr);
    }

}

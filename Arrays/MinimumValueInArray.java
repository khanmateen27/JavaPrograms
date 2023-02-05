<<<<<<< HEAD
import java.util.Scanner;
public class MinimumValueInArray {
    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArrayElements(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Enter the elements in an Array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void findMinimum(int size , int arr[]){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("The Minimum value in an array is : " + minValue);
    }
    public static void main(String[] args) {
        int size = inputSize();
        int arr[] = inputArrayElements(size);
        findMinimum(size , arr);
    }
}
=======
import java.util.Scanner;
public class MinimumValueInArray {
    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArrayElements(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Enter the elements in an Array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void findMinimum(int size , int arr[]){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("The Minimum value in an array is : " + minValue);
    }
    public static void main(String[] args) {
        int size = inputSize();
        int arr[] = inputArrayElements(size);
        findMinimum(size , arr);
    }
}
>>>>>>> 17bfa3806ceec2c43d8565bcf0a8463fbcf47123

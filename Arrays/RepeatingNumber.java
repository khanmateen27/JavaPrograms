<<<<<<< HEAD
import java.util.Scanner;
public class RepeatingNumber {

    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        return size;
    }

    static int[] inputElements(int size){
        int n = size;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in an Array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int repeatingNumber(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int size = inputSize();
        int[] arr = inputElements(size);
        int repeatingNumber = repeatingNumber(arr);
        System.out.println(repeatingNumber);
    }
=======
import java.util.Scanner;
public class RepeatingNumber {

    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        return size;
    }

    static int[] inputElements(int size){
        int n = size;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in an Array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int repeatingNumber(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int size = inputSize();
        int[] arr = inputElements(size);
        int repeatingNumber = repeatingNumber(arr);
        System.out.println(repeatingNumber);
    }
>>>>>>> 17bfa3806ceec2c43d8565bcf0a8463fbcf47123
}
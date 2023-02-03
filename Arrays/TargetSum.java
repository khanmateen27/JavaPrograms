import java.util.Scanner;
public class TargetSum {
    static int sizeOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArray(int size){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements in an Array: ");
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }
    static void targetSum(int arr[] , int target){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Indexes are :"+" "+i + " " + j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int size = sizeOfArray();
        int arr[] = inputArray(size);
        System.out.println("Enter the target Sum: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        targetSum(arr , target);
    }
}
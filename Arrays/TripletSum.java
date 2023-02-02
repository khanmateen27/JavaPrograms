import java.util.Scanner;
public class TripletSum {
    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in an Array: ");
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i ++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int inputTarget(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target: ");
        int target = sc.nextInt();
        return target;
    }
    static void findTripletSum(int size , int[] arr , int target){
        int count = 0;
        for(int i = 0 ; i < size ; i ++){
            for(int j = i+1 ; j<size ; j++){
                for(int k = j+1 ; k < size ; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        count++;
                        System.out.println("The values are : " + arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int size = inputSize();
        int arr[] = inputArray(size);
        int target = inputTarget();
        findTripletSum(size , arr , target);
    }
}
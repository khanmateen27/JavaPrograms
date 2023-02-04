import java.util.Scanner;
public class FindSecondMax {
    static int findMax(int[] arr){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static int findSecondMax(int[] arr){
        int maxValue = findMax(arr);
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == maxValue){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in an Array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        findMax(arr);
        int secondMax = findSecondMax(arr);
        System.out.println("The Second Max is: " + secondMax);
    }
}
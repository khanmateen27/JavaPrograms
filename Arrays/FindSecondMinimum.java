import java.util.Scanner;
public class FindSecondMinimum {
    static int findMinimum(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    static int findSecondMinimum(int[] arr){
        int minValue = findMinimum(arr);
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == minValue){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMinimum = findMinimum(arr);
        return secondMinimum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in an Array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        findMinimum(arr);
        int secondMinimum = findSecondMinimum(arr);
        System.out.println(secondMinimum);
    }
}
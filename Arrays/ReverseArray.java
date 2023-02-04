import java.util.Scanner;
public class ReverseArray {
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

        // First Method to reverse an Array
    /*  static int[] reverseArray(int[] arr){
         int j = 0;
         //new array created
         int ans[] = new int[arr.length];
         for(int i = ans.length-1 ; i >= 0 ; i--){
             ans[j++] = arr[i];
         }
         return ans;
    }*/

        //Second Method to reverse an Array
        static void swapInArray(int[] arr , int i , int j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }

        static void reverseArray(int[] arr){
            int i = 0 ; 
            int j = arr.length-1;
            while(i < j){
            swapInArray(arr , i , j);
            i++;
            j--;
            }
        }

    public static void main(String args[]){
        int size = sizeOfArray();
        int arr[] = inputArrays(size);
        //int reverseArray[] = reverseArray(arr);
        // System.out.println("The original array is: ");
        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.print(arr[i]+" ");
        // }
        reverseArray(arr);
        System.out.println();
        System.out.println("The reverse array is: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

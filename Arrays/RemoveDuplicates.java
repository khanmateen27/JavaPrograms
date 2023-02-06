import java.util.Scanner;
public class RemoveDuplicates {
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

                //Method 1[SP]
    // static int[] removeDuplicates(int[] arr){
    //     int n = arr.length;
    //     int temp[] = new int[n];
    //     int rd = 0;
    //     temp[rd] = arr[0];
    //     for(int i = 1 ; i < arr.length ; i++){
    //         if(temp[rd]!=arr[i]){
    //             rd++;
    //             temp[rd] = arr[i];
    //         }
    //     }
    //     return temp;
    // }

                //Method 2
    static int removeDuplicates(int[] arr){
        int n = arr.length;
        int rd = 0;
        for(int i = 1 ; i < n ; i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd+1;
    }
    // static void traverseArray(int[] temp){
    //     for(int i = 0 ; i < temp.length ; i++){
    //         System.out.print(temp[i] + " ");
    //     }
    // }
    public static void main(String[] args) {
        int size = sizeOfArray();
        int inputArrays[] = inputArrays(size);
        //int[] temp = removeDuplicates(inputArrays);
        //traverseArray(temp);
        int rd = removeDuplicates(inputArrays);
        for(int i = 0 ; i < rd ; i++){
            System.out.print(inputArrays[i] + " ");
        }
    }
}
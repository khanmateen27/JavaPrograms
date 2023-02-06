import java.util.Scanner;
public class ZerosToEnd {
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
    static void moveZerosToEnd(int[] arr){
        int n = arr.length;
        //nz --> non-zero , z --> zero
        int nz = 0 , z = 0; 
        while(nz < n){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
    }
    static void traverseArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int size = sizeOfArray();
        int inputArrays[] = inputArrays(size);
        moveZerosToEnd(inputArrays);
        traverseArray(inputArrays);
    }
}
import java.util.Scanner;
public class FindUnique {
    static int inputSize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void findUnique(int size , int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < size ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int size = inputSize();
        int arr[] = inputArray(size);
        findUnique(size , arr);
    }
}

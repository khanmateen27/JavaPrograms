import java.util.Scanner;

public class SearchElementInArray {
    static int sizeOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        return size;
    }
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an Array: ");
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void searchElement(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();
        int ans = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                ans = i;
                System.out.println("Found at index: " + ans);
            }
            else {
                System.out.println(-1);
            }
            break;
        }
    }
    public static void main(String args[]){
        int size = sizeOfArray();
        int array[] = inputArray(size);
        searchElement(array);
    }
}

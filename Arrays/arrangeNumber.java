public class arrangeNumber {
    
    static void arrangeNumbers(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int counter = 1;

        while(left <= right){
            if(counter % 2 == 1){
                arr[left] = counter;
                counter += 1;
                left += 1;
            }
            if(counter % 2 == 0){
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
        for(int a : arr){
        System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int array[] = {1 , 2, 3 ,4 , 5 , 6};
        arrangeNumbers(array);
    }
}

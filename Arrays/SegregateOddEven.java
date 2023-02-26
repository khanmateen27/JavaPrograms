/*
 Segregate Odd & Even Numbers in given Array
 */
public class SegregateOddEven {
    static void segregateArray(int array[]){
        //Corner Case
            if(array.length <= 1){
                return;
            }
            
        int left = 0 ;
        int right = array.length - 1;

        while(left < right){
            while(array[left] % 2 == 0 && left < right){
                left++;
            }
            while(array[right] % 2 != 0 && left < right){
                right--;
            }
    
        if (left < right)
        {
            int x = array[left];
            array[left] = array[right];
            array[right] = x;

            left++;
            right--;
        }
    }
    }
    public static void main(String args[]){
        int arr [] = {1 ,2 , 4, 3 , 5 , 7 , 8 ,6};
        segregateArray(arr);
    }
}
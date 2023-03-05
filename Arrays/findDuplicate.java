//Brute Force Method 
public class findDuplicate {
    static int FindDuplicate(int array[]){
        int ans = 0;
        for(int i = 0 ; i < array.length ; i++){
            ans = ans ^ array[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 1 , 6 ,0};
        int duplicate = FindDuplicate(arr);
        System.out.println(duplicate);
    }
}

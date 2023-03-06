public class maxSubArraySum {
    
    static void MaxSumSubArray(int number[]){
        int len = number.length - 1;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<=len ; i++){
            int start = i;
        for(int j = 0 ; j<=len ; j++){
            int end = j;
            currSum = 0;
        for(int k = start ; k<= end ; k++){
            currSum += number[k];
        }
        System.out.println(currSum);
        if(maxSum < currSum){
            maxSum = currSum;
        }
        }
        }
        System.out.println("Mam Sum = " +maxSum);
    }
    
    public static void main(String[] args) {
        int arrays[] = {2 , 4 , 6 , 8 , 10 };
        MaxSumSubArray(arrays);
    }
}

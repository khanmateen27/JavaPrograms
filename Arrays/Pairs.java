//Pairs in an Array
class Pairs{

    static void pairsInArray(int number[]){
        int len = number.length - 1;
        int curr =  0;
        int tp = 0;
        for(int i = 0 ; i<=len ; i++){
            curr = number[i]; // 2 , 4, 6 , 8 , 10
        for(int j = i+1 ; j<=len ; j++){
            System.out.print("(" + curr + "," + number[j] + ")");
            tp++;
        }
        System.out.println();
        }
        System.out.println("total pairs in an Array is: "+tp);
    }

    public static void main(String[] args) {
        int number[] = {2 , 4, 6 ,  8, 10};
        pairsInArray(number);
    }
}
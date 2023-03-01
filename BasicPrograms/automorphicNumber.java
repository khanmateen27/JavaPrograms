class automorphicNumber{
        public static void main(String[] args) {
            int num = 5;
            int c = 0 ; 
            int temp = num;
            //count Digits
                while(temp != 0){
                    temp /= 10;
                    c++;
                }
            int sq = num * num;
            int ld = sq % (int)Math.pow(10 , c);
            if(ld == num){
                System.out.println("Automorphic Number");
            }
            else{
                System.out.println("Not an Automorphic Number");
            }
        }
    }
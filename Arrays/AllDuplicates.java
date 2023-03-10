// Find All Duplicates in an Array

class AllDuplicates{

	static void findAllDuplicates(int arr[]){
		
		int ans = 0;

		for(int i = 0 ; i < arr.length ; i++){
			ans = ans & arr[i];
		}

		for(int i = 1 ; i < arr.length ; i++){
			ans = ans ^ i;
		}
		System.out.println(ans);
	}

	public static void main(String args[]){

		int arr[] = {4,2,7,8,2,1};

		findAllDuplicates(arr);
	}
}
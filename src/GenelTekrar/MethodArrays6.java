package GenelTekrar;

public class MethodArrays6 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 * 
		 * Input : {3,2,5,4,1,6}
		 * 
		 * Output :
		 * 
		 * min: 1
		 * 
		 * max: 6
		 */
		
		int arr[]= {3,2,5,4,1,6};
		
	
		
		minSayi(arr);
		
		maxSayi(arr);
	}
	

	private static void minSayi(int[] arr) {
		int minSayi=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minSayi>arr[i]) {
				minSayi=arr[i];
				
			}
			
		}
		System.out.println(minSayi);
	}



	private static void maxSayi(int[] arr) {
		int maxSayi=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxSayi<arr[i]) {
				maxSayi=arr[i];
		
	}
		}
		System.out.println(maxSayi);
	}
	
}

package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum
		//elemanlarini toplayan bir program yazalim.
		
		int arr[]= {3,5,8,5,2,4};
		
		int toplam =0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println("Elementlerin toplam: "+ toplam);
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i =arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+ " ");
			int tersArray[]=new int[arr.length];
			
		
			System.out.print(Arrays.toString(tersArray));
			
		
		}	

	}

}

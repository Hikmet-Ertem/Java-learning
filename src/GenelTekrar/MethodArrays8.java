package GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class MethodArrays8 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
		 * array into a new Array and prints it.
		 * 
		 * Input1={1,2,3,4}
		 * 
		 * Input2={5,6}
		 * 
		 * Output={1,2,3,4,5,6}
		 *
		 */


		int sayi1[]={1,2,3,4};
		int sayi2[]={5,6};
		
		//birlestirme(sayi1, sayi2);
		System.out.println(birlestirme(sayi1, sayi2));
	
	
	
	}

	private static List<Integer> birlestirme(int[] sayi1, int[] sayi2) {
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < sayi1.length; i++) {
			list.add(sayi1[i]);
			
			}
		
		for (int i = 0; i < sayi2.length; i++) {
			list.add(sayi2[i]);
			
			}
		return list;
		
	}

}

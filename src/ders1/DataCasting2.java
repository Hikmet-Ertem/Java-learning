package ders1;

public class DataCasting2 {

	public static void main(String[] args) {
		// Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		
		int sayi1=10;
		short sayi2=(short) sayi1;
		
		System.out.println(sayi1 + sayi2);
		
		byte sayi3= (byte)sayi1;
		
		System.out.println(sayi2 * sayi3);
		
		

	}

}

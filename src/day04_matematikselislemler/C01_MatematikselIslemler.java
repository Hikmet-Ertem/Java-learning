package day04_matematikselislemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); // 14
		
		System.out.println(4*(2+5)/3); // 28/3 = 9,333 ama ikisi de int oldugu icin virgulden sonrasini almaz
		
		// sonucu virgullu yazdirmak istersek 
		
		double sonuc=4*(2+5)/3;
		
		System.out.println(sonuc);
		
		sonuc= (double)4*(2+5)/3;
		
		System.out.println(sonuc);
		
		System.out.println(sonuc); // 9,333333324
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2); // 5/2=2
		
		System.out.println(sayi1/sayi3); // 5/2=2,5
		
		System.out.println(sayi1/sayi3/sayi2);
		
		
		
		

	}

}

package ders1;

public class DataCasting4 {

	public static void main(String[] args) {
		// Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip

		//			yazdirin
		
		double sayi1=255.36;
		int sayi2=(int) sayi1;
		
		System.out.println(sayi1+sayi2);
		
		byte sayi3=(byte) sayi2;
		
		System.out.println(sayi2 + sayi3);
		

	}

}

package ders1;

public class DataCasting1 {

	public static void main(String[] args) {
		// Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde

		//birer degisken olusturup adim adim widening yapin ve yazdirin
		
			byte sayi1=10;
			short sayi2= sayi1;
			
			System.out.println(sayi1 + sayi2);
			
			int sayi3=sayi2;
			
			long sayi4=sayi3;
			
			System.out.println(sayi3 * sayi4);
			
			float sayi5=sayi4;
			double sayi6=sayi5;
			
			System.out.println(sayi5 / sayi6);
			
		
				

	}

}

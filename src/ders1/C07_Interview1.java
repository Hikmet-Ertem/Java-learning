package ders1;

public class C07_Interview1 {

	public static void main(String[] args) {
		// 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
		//program yaziniz

		//Orn : sayi1=10 ve sayi2=20;
		//kod calistiktan sonra
		//sayi1=20 ve sayi2=10
		
		
		int sayi1=10;
		int sayi2=20;
		
		int bos=sayi2;
		
		sayi2=sayi1;
		sayi1=bos;
		
		System.out.println("sayi1=" + sayi1);
		System.out.println("sayi2= " + sayi2);
		
		System.out.println("*** sorunun diger cozum sekli***");
		
		//2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
		//degistiren (SWAP) bir program yapiniz
		
		sayi2=sayi2-sayi1;
		sayi1=sayi2+sayi2;
		
		System.out.println("sayi1=" + sayi1);
		System.out.println("sayi2= " + sayi2);

	}

}

package day04;

public class C05_İncrementDecrement {

	public static void main(String[] args) {
		//atama islemi olursa sayinin degeri kalici olarak degisir
		// atama islemi olmadan yapilan toplama, cikarma vs islemler sadece o satirda yapilir
		// sayinin degerini kalici olarak degistirmez
		
		int sayi1=10;
		
		System.out.println(sayi1+=5); //15
		// bu islem sayi1 in degerini 5 artirip sayi1 e assign ediyor
		// dolayisiyla sayi1 in degeri kalici olarak degesiyor
		
		System.out.println(sayi1); //15 
		
		System.out.println(sayi1+12); //27
		
		System.out.println(sayi1);//15
		
		sayi1++;
		// her ne kadar = isarati gorünmese de sayi1++ isleminde assign vardir.
		// dolayisiyla 
		
		System.out.println(sayi1);
		
				
				

	}

}

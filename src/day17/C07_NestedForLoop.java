package day17;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1'den 4 e kadar sayilari yan yana aralarinda bir bosluk bırakarak yazdirin

		for (int satir = 1; satir <=9; satir++) {
			
			for (int i = 1; i <=9; i++) {
			
				System.out.print(satir* i + " ");
			
				System.out.print("");
		}
		
	}
	}
}

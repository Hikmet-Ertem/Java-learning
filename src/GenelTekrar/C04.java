package GenelTekrar;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na
		 * d�n��t�rmek i�in bir Java program� yaz�n.
		 * 
		 * INPUT:
		 * 
		 * Dakika say�s�: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yakla��k 6 y�l 210 g�nd�r
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen dakika giriniz: ");
		
		int dakika=scan.nextInt();
		
		int ylDkSrs=365*24*60;
		
		int gunDk=24*60;
		
				
		int yil=dakika/ylDkSrs;
		
		int gun=(dakika - yil*ylDkSrs)/gunDk;
		
		System.out.println(dakika +" dakika yaklasik " + yil + " yil " + gun +" gundur");
	
	
	
	}

}

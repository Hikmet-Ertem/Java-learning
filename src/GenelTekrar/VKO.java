package GenelTekrar;

import java.util.Scanner;

public class VKO {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yaz�n (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * BMI 18,5'in alt�ndaysa zay�fs�n�z
		 * 
		 * BMI 18,5 ile 25 aras�nda ise kilonuz idealdir
		 * 
		 * BMI 25-30 aras�ndaysa �i�mans�n�z
		 * 
		 * BMI 30'dan b�y�k veya e�itse, obez
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen kilonuzu \n ve Boyunuzu giriniz:");
		
		double kilo=scan.nextDouble();
		double boy=scan.nextDouble();
		double BMI=kilo/(boy*boy);
		
		if (BMI<8.5) {
			System.out.println("Zayifsiniz");
		} else if(BMI>25 && BMI<30) {
			
		}
		
		
		
		
	}
	
	
	}

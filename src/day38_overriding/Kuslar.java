package day38_overriding;

public class Kuslar extends Animals {

public static void main(String[] args) {
		

	}
	
	public void hareket() {
		System.out.println("Kuslar Ucarak hareket eder");
	}
	
	
	public void solunum() {
		System.out.println("Kuslar akcigerleriyle nefes alir");
    }
}
/*
 * 1-parent-Child class'larda Overriding varsa Java Class calismadan bunlari isaretler
 * 2-Bir obje ile method cagirinca Java Data turunun classindaki methoda gider
 * 3- Gidilen method gecersiz kilinmissa(Overriden) Java Objenin Constructorina bakar
 * Constructor ile Overriding method ayni class'da ise Overriding method calisir
 */

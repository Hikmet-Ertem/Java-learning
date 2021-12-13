package day39_overridingKurallari_polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
	
	C02 obj1=new C02();
	obj1.privateMethod();
	obj1.staticMethod();
	
	C01 obj2=new C02();
	//obj2.privateMethod();
	//data turuC01 oldu�undan �ncelikle C01 class�ndaki
	//methoda bakmam�z gerekir. ancak private oldu�u i�in
	//ula�amad���m�z bir methodu override yapamay�z.
	//dolayisiyla signatur ayn� olmas�n RA�MEN bu ikisi farkl� method olarak �al���r.
	obj2.staticMethod();
		
		
		}

	public static void staticMethod() {
		System.out.println("Child class static method");
		
		
	}
	
	private void privateMethod() {
		
		System.out.println("Child class private method");
	}
	
	//public final void finalMethod() {
		//System.out.println("Parent class final method");
		
	}
	



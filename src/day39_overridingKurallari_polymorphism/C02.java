package day39_overridingKurallari_polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
	
	C02 obj1=new C02();
	obj1.privateMethod();
	obj1.staticMethod();
	
	C01 obj2=new C02();
	//obj2.privateMethod();
	//data turuC01 olduðundan öncelikle C01 classýndaki
	//methoda bakmamýz gerekir. ancak private olduðu için
	//ulaþamadýðýmýz bir methodu override yapamayýz.
	//dolayisiyla signatur ayný olmasýn RAÐMEN bu ikisi farklý method olarak çalýþýr.
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
	



package day34_accessModifier_encapsulu;

public class C02_BaskaPackageChildClass extends C01 {

	public static void main(String[] args) {
		C01 obj=new C01();
		
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}
	
	public void staticOlmayanMethod() {
		C01 obj=new C01();
		
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

}
}

package day38_overriding;

public class K�mesHayvanlar� extends Kuslar{

	public static void main(String[] args) {
		
		K�mesHayvanlar� kms1=new K�mesHayvanlar�();
		
		kms1.beslenme();
		kms1.hareket();
		kms1.solunum();
		
		Kuslar kms2=new K�mesHayvanlar�();
		kms2.beslenme();
		kms2.hareket();
		kms2.solunum();
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();
		kms3.hareket();
		kms3.solunum();
		
		Animals kms4=new K�mesHayvanlar�();
		kms4.beslenme();
		kms4.hareket();
		kms4.solunum();
		
		
		
		
		
	}
	public void hareket() {
        System.out.println("K�mes havyalar� y�r�yerek hareket eder");
    }
    
    
}

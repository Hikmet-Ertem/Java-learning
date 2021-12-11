package day38_overriding;

public class KümesHayvanları extends Kuslar{

	public static void main(String[] args) {
		
		KümesHayvanları kms1=new KümesHayvanları();
		
		kms1.beslenme();
		kms1.hareket();
		kms1.solunum();
		
		Kuslar kms2=new KümesHayvanları();
		kms2.beslenme();
		kms2.hareket();
		kms2.solunum();
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();
		kms3.hareket();
		kms3.solunum();
		
		Animals kms4=new KümesHayvanları();
		kms4.beslenme();
		kms4.hareket();
		kms4.solunum();
		
		
		
		
		
	}
	public void hareket() {
        System.out.println("Kümes havyaları yürüyerek hareket eder");
    }
    
    
}

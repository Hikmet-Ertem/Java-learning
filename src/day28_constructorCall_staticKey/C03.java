package day28_constructorCall_staticKey;

public class C03 {

	public static void main(String[] args) {
		// Java run time bir programd�r.
		// run tu�una bast���n�zda java �al��maya ba�lar ve i�lemleri yapar.
		// javan�n isi bitti�inde (�al��ma tu�u k�rm�z�ya d�nd���nde)
		// her�eye yeniden ba�lar.
		
		// static variable ve method lar bulunduklar� class ile ilintilidir.(obje ile igili de�il class ile)
		// ba�ka bir classda iken C02  deki static variable veya methoda ula�mak istedi�imizde
		//C02.staticVariableIsmi ve C02.staticVariableIsmi() yazmam�z yeterlidir.
		
        C02 obje1= new C02();
        System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + obje1.y);
        
        obje1.x++;
        obje1.y++;
        // static bir varibale a class ismi �zerinden ula�mak yerine
        // instance variablelar gibi obje ile ula�maya �al���rsan�z
        // Java CTE vermez ama solda ! i�areti ile bizi uyar�r.
        // "static bir field  olan C02.y ye 
        System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + obje1.y);
        
        
        C02 obje2= new C02();
        System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y);
        
        obje2.x++;
        obje2.y++;
        
        System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y);
        
        System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in "
                           + " x : " + obje1.x + " y : " + obje1.y);
        
        
        
        C02 obje3 = new C02();
        
        obje3.x=20;
        obje3.y=40;
        
        
        System.out.println("obje3'den sonra obje1'in x :" + obje1.x);//6
        System.out.println("obje3'den sonra obje2'in x :" + obje2.x);//6
        System.out.println("obje3'den sonra obje3'in x :" + obje3.x);//20
        
        
        System.out.println("obje3'den sonra obje1'in y :" + obje1.y);//40
        System.out.println("obje3'den sonra obje2'in y :" + obje2.y);//40
        System.out.println("obje3'den sonra obje3'in y :" + obje3.y);//240
        

	}

}

package day10;

public class C08_SwitchCase {

	public static void main(String[] args) {
		// gun numarasýna göre hafta içi veya hafta  sonu yazdýrsýn
		
				int gunNo=6;
				
				switch(gunNo) {
	
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("Hafta ici");
					break;
				case 6:
				case 7:
					System.out.println("Hafta sonu");
					break;
					
					default:
						System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
				
				}
				
				
	}
	
	
}

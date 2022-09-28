package methods2;

public class Main {		//variable arguments

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		//String yeniMesaj = mesaj.substring(0,2);		//substring takes characters 0 to 2 except 2 at this line. substring returns value.
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4);
		System.out.println(toplam);
		
	}

	public static void ekle() {		//void operations means do something.
		
		System.out.println("Eklendi.");
		
	}
	
	public static void sil() {
		
		System.out.println("Silindi.");
		
	}
	
	public static void guncelle() {		//we can't assign void operations to a variable.
		
		System.out.println("Güncellendi.");
		
	}
	
	public static int topla(int sayi1,int sayi2) {		//this means that the function returns an integer value.
		
		//return 5;		//this means that finish but return 5.
		return sayi1 + sayi2;		//will return by adding sayi1 and sayi2.
		
	}
	
	public static int topla2(int... sayilar) {		//when written as (int... sayilar) it's like sending an int array
		
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	public static String sehirVer() {		//this means that the function returns a String value.
		
		return "Ankara";
	
	}
	
}



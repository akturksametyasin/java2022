package recapDemo1;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 24;
		int sayi2 = 25;
		int sayi3 = 26;
		int enBüyük = sayi1;		//enBüyük değişkeni sayi1 yaptık yani aşağıdaki if blokları çalışmazsa enBüyük değişkeni sayi1 olarak kalır.
		
		if(enBüyük<sayi2) {		//sayi1 sayi2'den küçük ise if bloğu çalışır.
			enBüyük = sayi2;		//if bloğu çalışırsa enBüyük değişkeni sayi2 olur.
		}
		
		if(enBüyük<sayi3) {		//sayi1 sayi3'ten küçük ise if bloğu çalışır.
			enBüyük = sayi3;		//if bloğu çalışırsa enBüyük değişkeni sayi3 olur.
		}
		
		System.out.println("En büyük = " + enBüyük);		//ekrana enBüyük değişkenini yazdırır.
		
	}

}
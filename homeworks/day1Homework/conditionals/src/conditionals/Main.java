package conditionals;

public class Main {		//şart blokları

	public static void main(String[] args) {
		
		int sayi = 24;
		
		if(sayi<20) {		//eğer sayı 20'den küçük ise şart bloğu çalışır.
			System.out.println("Sayı 20'den küçüktür.");		
		}
	
		else if(sayi==20) {		//= sayıya değer atamaktır, == eşitlik operatörüdür, eşit olup olmadığına bakar.
			System.out.println("Sayı 20'ye eşittir.");		//sayi 20'ye eşit ise else if bloğu çalışır.
		}
		
		else {		//yukarıdaki şartlar sağlanmazsa else bloğu çalışır.
			System.out.println("Sayı 20'den büyüktür.");
		}
	}

}
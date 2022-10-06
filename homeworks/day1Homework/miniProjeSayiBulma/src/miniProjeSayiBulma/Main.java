package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};		//sayilar değişkenine sayı dizisi tanımlandı.
		int aranacak = 6;
		boolean varMi = false;		//ilk başta sayı yok gibi varsayıyoruz.
		
		for(int sayi: sayilar) {		//sayilar dizisindeki her bir eleman sayi değişkenine atanarak bütün elemanları gezer.
			if(sayi==aranacak) {		//sayi değişkeni aranacak sayıya eşitse komut çalışır.
				varMi = true;		//sayi var demektir.
				break;		//sayı varsa döngünün devam etmesine gerek o yüzden break komutu kullanıldı.
			}
		}
		
		if(varMi) {		//for döngüsü sonucunda varMi true olarak çıkarsa if komut bloğu çalışır.
			System.out.println("Sayı mevcuttur.");
		}

		else {		//varMi değişkeninin değeri değişmezse yani başta verdiğimiz false değeri kalırsa else komut bloğu çalışır.
			System.out.println("Sayı mevcut değildir.");
		}
		
	}

}
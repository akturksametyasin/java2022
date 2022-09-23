package loopDemo;

public class Main {		//döngüler

	public static void main(String[] args) {
		
		//for
		for(int i=1;i<=10;i++) {		//int i=1, 1'den başla demektir. i<=10, i 10'dan küçük veya eşit olduğu sürece döngüyü çalıştır demektir. i++, i=i+1 yani her seferinde artış miktarını gösterir bu da i'ye her seferinde 1 ekle demektir.
			System.out.println(i);		//i sayısı 10'dan küçük olduğu sağlandığı sürece i sayısını ekrana yazdırır.
		}
		System.out.println("For Döngüsü Bitti");		//for bloğu dışında yazdığımız için döngü bittikten sonra Döngü Bitti yazısını ekrana yazdırır.

		for(int i=1;i<=10;i+=2) {		//i+=2 her seferinde 2 ekle demektir.
			System.out.println(i);		//1'den başlayarak her seferinde 2 ekleyip 10'a kadar tek sayıları yazar.
		}
		System.out.println("For Döngüsü Bitti");
		
		for(int i=2;i<=10;i+=2) {		
			System.out.println(i);		//2'den başlayarak her seferinde 2 ekleyip 10'a kadar çift sayıları yazar.
		}
		System.out.println("For Döngüsü Bitti");
		
		
		//while
		int i = 1;
		
		while(i<10) {		//i 10'dan küçük değilse komut satırını çalıştırmaz.
			System.out.println(i);
			i++;		//eğer artışı gösteren komut satırı yani i++;'ı eklemezsek i hep 1'e eşit olup 10'dan küçük olacağı için döngü sonsuza kadar çalışır.
		}		//i++ yerine kaçar kaçar arttırmak istiyorsak i+=2 şeklinde yazılabilir.
		System.out.println("While Döngüsü Bitti");
		
		
		//do-while
		int j = 1;
		
		do {		//satır satır ilerlediği için j başlangıçta 10'dan küçük değilse bile bir kere çalışır.
			System.out.println(j);
			j+=2;
		}
			while(j<10);		//j 10'dan küçük ise döngüyü çalıştırır, eğer j 10'dan büyük ise kodu bitirir.
		System.out.println("Do-While Döngüsü Bitti");
	}

}
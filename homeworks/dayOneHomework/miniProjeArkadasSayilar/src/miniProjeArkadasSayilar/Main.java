package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		//iki sayı birbirinin kendisi hariç pozitif bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
		//örnek:
		//220’nin kendisi hariç pozitif bölenlerinin toplamı : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
		//284’ün kendisi hariç pozitif bölenlerinin toplamı : 1 + 2 + 4 + 71 + 142 = 220
		//(220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), ve (66928, 66992)’dir.

		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		if(number1<1 || number2<1) {		//sayi1 veya sayi2 1'den küçükse geçersiz sayılır.
			System.out.println("Geçersiz sayı girişi.");
			return;
		}
		
		else if(number1>=1 && number2>=1) {		//number1 veya number2 1'den büyük eşitse else if komut bloğu çalışır.
			for(int i=1;i<number1;i++) {		//1'den başlayarak number1'den bir küçük sayıya kadar döngü devam eder. eğer number1 1 ise for döngüsü çalışmaz.
				if(number1 % i == 0) {		//number1 değişkeninin i'ye bölümünden kalan değer 0'a eşitse if komut bloğu çalışır.
					total1 = total1 + i;		//total1 ile i'leri toplayarak pozitif tam sayı bölenlerinin toplamı bulunur.
				}
			}
		
			for(int i=1;i<number2;i++) {		//1'den başlayarak number2'den bir küçük sayıya kadar döngü devam eder. eğer number2 1 ise for döngüsü çalışmaz.
				if(number2 % i == 0) {		//number2 değişkeninin i'ye bölümünden kalan değer 0'a eşitse if komut bloğu çalışır.
					total2 = total2 + i;		//total2 ile i'leri toplayarak pozitif tam sayı bölenlerinin toplamı bulunur.
				}
			}
		
			if(number1==total2 && number2==total1) {		//number1 ile total2 ve number2 ile total1 birbirine eşit ise if komut bloğu çalışır yani bu ikililer arkadaş sayılardır.
				System.out.println("(" + number1 + "," + number2 + ") : İkilisi arkadaş sayılardır.");
			}
		
			else {		//diğer durumlarda ise arkadaş sayı değillerdir. eğer number1 veya number2 1 olursa for döngüsü çalışmayacağı için total'ler 0'a eşit olur ve number'lar ile eş olmaz else komut bloğu çalışır.
				System.out.println("(" + number1 + "," + number2 + ") : İkilisi arkadaş sayı değillerdir.");
			}
		
		}
	}

}
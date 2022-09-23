package miniProjeMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		//mükemmel sayı: kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
		//mükemmel sayı örnekleri: 6, 28, 496, 8128, 33550336
		
		int number = 28;
		int total = 0;
		
		if (number==1) {		//1 mükemmel sayı değildir.
			System.out.println(number + " : Mükemmel sayı değildir.");
			return;
		}
		
		else if(number<1) {		//0 ve negatif ifadeler mükemmel sayı değildir.		
			System.out.println(number + " : Geçersiz sayı.");
			return;
		}
		
		else if(number>1){		//eğer number 1'den büyük ise komut satırı çalışır.
			for(int i=1;i<number;i++) {		//tam pozitif tam bölenleri bulmak için döngüye ihtiyacımız var.
				if(number % i == 0) {		//eğer number'ın i'ye bölümünden kalan 0 ise komut bloğu çalışır.
					total = total + i;		//tam sayı bölenlerini buldukça total değişkenine toplanır.
				}
			}
		
			if(total == number) {		//mükemmel sayının özelliği olan total pozitif tam bölenlerin toplamı number'a eşitse if komut bloğu çalışır.
				System.out.println(number + " : Mükemmel sayıdır.");
			}
		
			else {		//eğer total, number'a eşit değilse else komut bloğu çalışır.
				System.out.println(number + " : Mükemmel sayı değildir.");
			}
		}
			
	}

}
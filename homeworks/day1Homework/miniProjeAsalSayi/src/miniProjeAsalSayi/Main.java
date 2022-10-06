package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 97;
		
		if (number==1) {		//en küçük asal sayı 2 olduğu için 1 asal sayı değildir.
			System.out.println(number + " : Asal değildir.");
			return;
		}
		
		else if(number<1) {		//0 ve negatif ifadeler asal sayı değildir.
			System.out.println(number + " : Geçersiz sayı.");
			return;
		}
		
		else if(number>1){		//eğer number 1'den büyük ise komut satırı çalışır.
			boolean isPrime = true;		//for döngüsü 2 için çalışmayacağı için asal sayı olup olmadığını ilk önce true yapıyoruz.
			for(int i=2;i<number;i++) {		//2'den başlayarak number'ı numberdan bir küçük sayıya kadar döngü devam eder.
				int remainder = number % i;		//number değişkeninin i'ye bölümünden kalan değeri remainder değişkenine koyar.			
				if(remainder == 0) {		//eğer kalan 0'a eşit ise komut satırı çalışır.
					isPrime = false;		//yani 0'a bölünmesi asal olmadığı anlamına gelir bunun karşılığı da false olmalıdır.
				}	 
			}

			if(isPrime)	{		//eğer asal olup olmadığı true ise komut satırı çalışır.
				System.out.println(number + " : Asaldır.");		
			}
			else {		//diğer durumlarda bu komut satırı çalışır.
				System.out.println(number + " : Asal değildir.");
			}
		}
	}
}
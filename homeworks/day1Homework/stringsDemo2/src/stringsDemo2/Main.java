package stringsDemo2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println(mesaj.replace(' ','-'));		//karakterlerin değiştirilmesinde kullanılır, mesaj değişkeninin kendisini değiştirmez.
		System.out.println(mesaj);		//replace fonksiyonundan sonra mesaj değişkenini ayrı olarak yazdırırsak değişiklik olmaz.
		
		String yeniMesaj = mesaj.replace(' ','-');		//replace fonksiyonu yeni bir metin oluşturur, farklı bir değişkene atanıp kullanılablir.
		System.out.println(yeniMesaj);
		
		
		System.out.println(mesaj.substring(2));		//substring fonksiyonu bir metnin içerisinden parça almayı sağlar. 2. indexten itibaren metni alır.
		System.out.println(mesaj.substring(2,5));		//2. indexten 5. indexe kadar alır.
		
		
		for(String kelime : mesaj.split(" ")) {		//split fonksiyonu bir metni belli bir karakter veya karakter dizisini dikkate alarak metni parçalamayı sağlar.
			System.out.println(kelime);		//komut bloğu mesaj değişkenindeki kelimeleri boşluklara göre ayırarak ekrana yazdırır ve for döngüsüyle devam eder.
		}										
		
		
		System.out.println(mesaj.toLowerCase());		//toLowerCase fonksiyonu mesaj değişkenini küçük harf ile yazılmasını sağlar.
		
		System.out.println(mesaj.toUpperCase());		//toUpperCase fonksiyonu mesaj değişkenini büyük harf ile yazılmasını sağlar.
		
		
		String mesaj2 = "      Bugün hava çok güzel.        ";
		System.out.println(mesaj2.trim());		//trim fonksiyonu mesaj2 değişkeninin başındaki ve sonundaki boşlukları silmeyi sağlar.
		
		
		
	}

}
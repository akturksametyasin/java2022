package dataTypes;

public class Main {		//veri tipleri

	public static void main(String[] args) {
		
		int sayi1 = 12;
		sayi1 = 13;		//sayi1 değişkenine başta sayısal bir veri tanımladığımız için sonradan metinsel bir veri ile değiştiremeyiz.
		
		//primitive types = ilkel tipler yani bir dilin en temel veri tipleridir.
		
		byte sayi2 = 127;
		
		double sayi3 = 12.5;		//float ve double ondalıklı sayı tutar.
		
		float sayi4 = 15.6F;		//float'da sayı sonuna F eklemeliyiz çünkü normal şekilde yazdığımızda java bu sayıyı double olarak görür.
		
		int sayi5 = 1_234_567_890;		//büyük sayıları daha okunabilir yapmak için her 3 sayı arasına _ koyulur. (normal hayattaki nokta gibi)
		
		long sayi6 = 21_234_567_890L;		//float'ta olduğu gibi long'da da sayı sonuna L eklemeliyiz çünkü normal şekilde yazdığımızda java bu sayıyı int olarak görür
				
		//en çok kullanılan veri tipleri int ve double'dır.
		
		String sehir = "ANKARA";		//String karakter topluluğunu tutar.
		char karakter = 'A';		//char bir harf yani bir karakter tutar ve tek tırnak içerisinde yazılır.
		
		boolean dogruMu = true;		//boolean true veya false yani 1 veya 0 değerini tutar.
		
	}

}
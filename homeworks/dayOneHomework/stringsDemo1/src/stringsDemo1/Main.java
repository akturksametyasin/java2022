package stringsDemo1;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";		//String bir karakter(char) dizisidir.
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : " + mesaj.length());		//mesaj.lenght() mesaj değişkenindeki elemans sayısıdır.
		
		System.out.println("5. eleman : " + mesaj.charAt(4));		//mesaj.charAt(4) mesaj değişkenindeki 4. intexidir yani 5. karakterdir.
		
		System.out.println(mesaj.concat(" Yaşasın!"));		//mesaj.concat(" Yaşasın!") fonksiyonu mesaj değişkenine ekleme yapar.
		System.out.println(mesaj);		//mesaj.concat(" Yaşasın!") kommutu ile yeni bir değişken atandığı için mesaj değişkeni değişmez. mesaj2 = mesaj.concat(" Yaşasın!") şeklinde sonradan kullanılmak üzere yeni bir değişkene atanabilir.
		
		System.out.println(mesaj.startsWith("B"));		//mesaj.startsWith("B") fonksiyonu mesaj değişkeni B ile başlarsa true yoksa false yapar. 
		System.out.println(mesaj.endsWith("l"));		//mesaj.endsWith(".") fonksiyonu mesaj değişkeni sonunda l varsa true yoksa false yapar.
		
		char[] karakterler = new char [5];
		mesaj.getChars(0, 5, karakterler, 0);		//fonksiyon; mesaj değişkenindeki 5 elemanı karakterler değişkenine ata demektir.
		System.out.println(karakterler);			//mesaj.getChars(baslangicElemani,kacinciElemanaKadar,elemanlarinAtanacagiDegisken,karakterlerinKacinciElemanindanItibarenAtansin);
		
		System.out.println(mesaj.indexOf('a'));		//a karakterinin mesaj değişkeni içerisinde kaçıncı eleman olduğunu bulmaya yarar.
		System.out.println(mesaj.indexOf("av"));		//ilk buluğu a karakterinde aramayı bitirir.
		
		System.out.println(mesaj.lastIndexOf('a'));		//yine baştan kaçıncı olduğunu gösterir fakat aramaya sondan başlar.
		
		
		
	}

}
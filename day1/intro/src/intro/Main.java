package intro;

public class Main {

	public static void main(String[] args) {		//Main Java'da başlangıç noktasıdır
		
		System.out.println("Hello World!");		//sys yazdıktan sonra ctrl+space basarak hazır kodlara ulaşılır.
												
		String ortaMetin = "İlginizi Çekebilir";		//String metinsel ifade	
		String altMetin = "Vade Süresi";		//değişken isimlendirmeleri camelCase şeklinde yazılır.
		
		System.out.println(ortaMetin);		//komut satırının bittiğini ; ile anlarız.
		
		
		int vade = 12;		//integer tam sayılar için kullanılır.
		
		double dolarDun = 18.25;		//double ondalıklı sayılar için kullanılır.
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;		//boolean true veya false yani 1 veya 0 değerini tutar.
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {		//if bloğu true olmazsa else if bloğu çalışır.
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun>dolarDun) {		//else if bloğu çalışır ise else bloğu çalışmaz.
			okYonu = "up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu = "equal.svg"; 		//yukarıdaki bloklardan hiç biri çalışmaz ise else bloğu çalışır.
			System.out.println(okYonu);
		}
		
		
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "kredi X";
		String kredi3 = "kredi Y";		//gerçek hayatta listeler halinde yazılacaklar bu şekilde yazılmaz.
		
		//array
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};		//bu veriler gerçek bir projede data baseden (veri kaynağından) gelir
		
		System.out.println(krediler[0]);		//kodlamada ilk eleman 0'dan başlar.
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);		//bu şekilde yazmak yerine döngüler ile (for) dinamik sistemler yapılır.
		
		for (int i = 0; i < krediler.length; i++) {		//for şartı sağlarsa komutu tekrarlar.
			System.out.println(krediler[i]);		//int i = 0; Saymaya ilk veriden başlar.
		}							//i < krediler.length; i krediler değişkeninin eleman sayısından küçük olduğu sürece for döngüsü devam eder.
									//i++ yani i=i+1 sırasıyla gitmesini sağlar yani 1.eleman-2.eleman.3.eleman.4. elemana gitmez çünkü i < krediler.length sağlanamaz.
	}

}
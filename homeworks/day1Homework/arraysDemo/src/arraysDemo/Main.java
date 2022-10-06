package arraysDemo;

public class Main {		//diziler

	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------------");

		String[] ogrenciler = new String[4];		//4 ifadesi ogrenciler'in kaç elemandan oluşacağını gösterir.
		ogrenciler[0]="Engin";		//kodlamada eleman sayıları 0. indexten başlar yani 1. eleman 0. indextir.
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		//ogrenciler[4]="Ali"; kodu gibi eleman sayısından fazla kişi eklersek hata alırız.
		
		for(int i=0;i<ogrenciler.length;i++) {		//i<ogrenciler.length ifadesi ogrencilerin eleman sayısından küçük olduğu sürece demektir yani 3'ten küçük olduğu sürece çalışır.
			System.out.println(ogrenciler[i]);		//döngü başlangıcından itibaren i kaç olursa o sayıya karşılık gelen öğrenci ismini yazdırır.
		}
		
		System.out.println("----------------------------");
		
		for(String ogrenci:ogrenciler) {		//komut; ogrenciler dizisindeki her bir elemanı gez demektir. ogreciler'deki her bir ogrenci
			System.out.println(ogrenci);
		}
		
	}

}
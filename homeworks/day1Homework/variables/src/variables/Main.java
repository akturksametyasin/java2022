package variables;

public class Main {		//değişkenler

	public static void main(String[] args) {
		
		System.out.println("Öğrenci sayım : 10");		//case sensitive (büyük, küçük harf duyarlı)
		System.out.println("Öğrenci sayım : 10");
		System.out.println("Öğrenci sayım : 10");
		System.out.println("Öğrenci sayım : 10");		//sayılarda bir değişiklik olduğunda her yeri değiştimemiz gerekir dolayısıyla bu şekilde yazılmaz değişkenlerden yararlanılır.
		
		int ogrenciSayisi = 12;		//int yani integer değişkeni tam sayıları tutar.
		String mesaj = "Öğrenci sayısı : ";		//String değişkeni metinsel verileri tutar.
					//değişkenler camelCase şeklinde isimlendirme yapılır.
		
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);		//değişkenler ile yazıldığında değişken değiştirildiğinde her yer değişir ve kolaylık sağlar.
		
	}

}
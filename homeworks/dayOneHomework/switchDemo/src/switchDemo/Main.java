package switchDemo;

public class Main {		// switch blokları if bloklarından başka, şartlı dallandırma yöntemidir.

	public static void main(String[] args) {

		// switch blokları if bloklarında göre çok daha az kullanılır.

		char grade = 'G';		// kurumsal firmalarda isimlendirmeler İngilizce olarak yazılır.

		switch (grade) {		// switch-case
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;		// programı bitirmek için break; komutu yazılır.
			case 'B':
				System.out.println("Çok Güzel : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':		//F veya G yazıldığında aynı çıktıyı almak için bu şekilde yazılır.
			case 'G':	
				System.out.println("Maalesef : Kaldınız");
				break;
			default:		// Yukarıdaki notlar dışında bir giriş olursa çalışır.
				System.out.println("Geçersiz not girdiniz.");
		}
	}

}
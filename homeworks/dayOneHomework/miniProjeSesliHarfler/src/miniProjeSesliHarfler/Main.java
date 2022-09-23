package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf = 'A';
		
		switch((harf)) {
			case 'A':
			case 'O':
			case 'U':
			case 'I':
				System.out.println(harf + " : Kalın sesli bir harftir.");		//yukarıdaki sesli harflerden yazıldığında bu çıktıyı verir.
				break;
				
			case 'E':
			case 'Ö':
			case 'Ü':
			case 'İ':
				System.out.println(harf + " : İnce sesli bir harftir.");		//yukarıdaki sesli harflerden yazıldığında bu çıktıyı verir.
				break;
			default:
				System.out.println(harf + " : Sesli harf değildir.");		//diğer durumlarda bu çıktıyı sağlar.
		}
			

	}

}
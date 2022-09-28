package methods;

public class Main {		//Classes are named with PascalCasing naming method.

	public static void main(String[] args) {		//dry: Don't Repeat Yourself
			//methods are created in order not to repeat ourselves.
		sayiBulamaca();		//calls sayiBulmaca method
		sayiBulamaca();
		sayiBulamaca();
		sayiBulamaca();
		
	}
	//Methods are named with the camelCasing naming method.
	public static void sayiBulamaca() {		//sayiBulamaca method is created.
		
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur: " + aranacak);		//calls mesajVer method and then assigns ("Sayı mevcuttur: " + aranacak) to mesaj variable. runs the code below the method.
		}

		else { 
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {		//parameterized method
	
		System.out.println(mesaj);		//the aranacak variable gave an error because the aranacak variable is in the other method.
		
	}
	
}
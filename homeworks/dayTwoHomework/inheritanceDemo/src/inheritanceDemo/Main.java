package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());		//we can send here the TarimKrediManager or OgretmenKrediManager as a parameter.
				//polymorphism: multiformity
	}

}

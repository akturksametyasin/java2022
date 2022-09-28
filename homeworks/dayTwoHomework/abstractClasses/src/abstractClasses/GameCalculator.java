package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();		//abstract keyword doesn't allow default value for inheritancers so inheritancers have to have own method of hesapla.
	
	public final void gameOver() {		//final keyword doesn't allow to override.
		System.out.println("Oyun bitti");
	}
	
}

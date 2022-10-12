package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

		//GameCalculator gameCalculator = new GameCalculator();		//abstract ones cannot be new.
		
		GameCalculator gameCalculator = new WomanGameCalculator();		//gameCalculator holds the reference value of the WomanGameCalculator.
	}

}.

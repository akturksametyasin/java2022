package interfaceOdev;

public class CustomerManager {
	private Mevzuat mevzuat;
	
	public CustomerManager(Mevzuat mevzuat) {
		this.mevzuat = mevzuat;
	}
	
	public void add() {
	mevzuat.islemYap();
	}
}

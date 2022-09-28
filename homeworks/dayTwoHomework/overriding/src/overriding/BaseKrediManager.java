package overriding;

public class BaseKrediManager {

	public final double hesapla(double tutar) {		//final keyword doesn't allow to override
		return tutar * 1.18;
	}
	
}

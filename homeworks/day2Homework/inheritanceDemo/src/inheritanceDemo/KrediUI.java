package inheritanceDemo;

public class KrediUI {		//summoning the OgretmenKrediManager or the TarimKrediManager

	public void KrediHesapla(BaseKrediManager baseKrediManager) {		//as a parameter we said we will give a baseKrediManager.
		baseKrediManager.Hesapla();
	}
	
}

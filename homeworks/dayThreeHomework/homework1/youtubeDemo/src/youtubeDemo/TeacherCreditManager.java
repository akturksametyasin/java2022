package youtubeDemo;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");
		
	}
	
	public void save() {
		super.save();
	}

}

package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		/* double[] myList = new double[4]; 
		myList[0]=1.2;
		myList[1]=1.3;
		myList[2]=4.3;
		myList[3]=5.6; */		//şeklinde yazmak yerine aşağıdaki gibi tek satırda yazabiliriz.
		
		double[] myList = {1.2,6.3,4.3,5.6};		
		double total = 0;
		double max = myList[0];
		
		for (double number:myList) {		//komut; myList içerisindeki number'ları gez demektir.
			if(max<number) {
				max = number;
			}
			total = total + number;		//ilk başta 0 ile 1.2 yi toplar ve her döngüde bir sonraki sayıyı toplar yani bütün elemanların toplam sonucuna ulaşır.
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max);
		
	}

}
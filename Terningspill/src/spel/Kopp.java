package spel;

public class Kopp {
	int id;
	int sum;
	Terning ter1;
	Terning ter2;
	
	
	public Kopp(int id) {
		sum = 0;
		this.id = id;
		ter1 = new Terning(1);
		ter2 = new Terning(2);
		
	}
	
	public void trill() {
		ter1.trill();
		ter2.trill();
		sum = ter1.getVerdi() + ter2.getVerdi();
	}
	
	public int getSum() {
		return sum;
	}
}

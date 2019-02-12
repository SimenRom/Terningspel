package spel;

public class Spiller {
	String navn;
	int verdi;
	
	public Spiller(String navn) {
		this.navn = navn;
		verdi = 0;
	}
	
	public void spill(Kopp kopp) {
		kopp.trill();
		verdi = kopp.getSum();
	}
	
	public int getVerdi() {
		return verdi;
	}
	
	public String getNavn() {
		return navn;
	}
}

package spel;

import java.util.concurrent.ThreadLocalRandom;

public class Terning {
	int id;
	int verdi;
	
	public Terning(int id) {
		this.id = id;
		verdi = 0;
	}
	
	public void trill() {
		verdi = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	}
	
	public int getVerdi() {
		return verdi;
	}
}

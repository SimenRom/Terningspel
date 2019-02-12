package spel;

import java.util.ArrayList;
import java.util.List;

public class Terningspill {
	int id;
	List<Spiller> spillere = new ArrayList<Spiller>();
	Kopp kopp;
	
	public Terningspill(int id) {
		kopp = new Kopp(1);
		this.id = id;
	}
	public void leggTilSpiller(String navn) {
		spillere.add(new Spiller(navn));
	}
	
	public Spiller spill() {
		Spiller l = new Spiller("ingen");
		for(Spiller s : spillere) {
			s.spill(kopp);
			int verdiS = s.getVerdi();
			if(verdiS >= l.getVerdi()) {
				l = s;
			}
		}
		return l;
	}
}

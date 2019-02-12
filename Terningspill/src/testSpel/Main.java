package testSpel;

import spel.Spiller;
import spel.Terningspill;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Terningspill spel = new Terningspill(1);
			spel.leggTilSpiller("Alfa");
			spel.leggTilSpiller("Beta");
			spel.leggTilSpiller("Charlie");
			Spiller vinner = spel.spill();
			System.out.println("Vinner runde "+i+": " + vinner.getNavn() + ", med poeng: " + vinner.getVerdi());
		}
	}
}

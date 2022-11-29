package cz.vutbr.feec.dsa;

import java.util.HashMap;

public class Uzel {
	private String nazev;
	
	private HashMap<Uzel, Integer> soused = new HashMap<>();
	
	public Uzel(String uzel) {
		this.nazev = uzel;
	}
	
	public void addSoused(Uzel uzel, int vaha) {
		soused.put(uzel, vaha);
	}

	public String getUzel() {
		return nazev;
	}

	public void setUzel(String uzel) {
		this.nazev = uzel;
	}

	public HashMap<Uzel, Integer> getSoused() {
		return soused;
	}
}

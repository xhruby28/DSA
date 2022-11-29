package cz.vutbr.feec.dsa;

import java.util.LinkedList;

public class Cesta {
	private int cena;
	Graf g = new Graf();
	
	private LinkedList<Uzel> cesta = new LinkedList<>();
	
	public Cesta(Graf g) {
		this.g = g;
	}

	public void addVrchol(String vrchol) {
		cesta.add(g.getUzel(vrchol));
	}

	public int getCena() {
		int index = 0;
		Uzel tempUzel = null;
		for (Uzel uzel : cesta) {
			if(index > 0) {
				if(uzel.getSoused().containsKey(tempUzel)) {
					cena += uzel.getSoused().get(tempUzel);
				}
			}
			tempUzel = uzel;
			index++;
		}
		return cena;
	}	
}

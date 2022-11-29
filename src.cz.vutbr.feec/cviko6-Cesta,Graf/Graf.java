package cz.vutbr.feec.dsa;

import java.util.HashMap;

public class Graf {
	private HashMap<String, Uzel> uzly = new HashMap<>();
	
	public void add(String uzel1, String uzel2, int vaha) {
		Uzel u1 = takeOrCreate(uzel1);
		Uzel u2 = takeOrCreate(uzel2);
		u1.addSoused(u2, vaha);
		u2.addSoused(u1, vaha);
	}

	private Uzel takeOrCreate(String uzel) {
		Uzel temp = uzly.get(uzel);
		if(temp == null) {
			temp = new Uzel(uzel);
			uzly.put(uzel, temp);
		}
		return temp;
	}
	
	public Uzel getUzel(String nazevUzlu) {
		return uzly.get(nazevUzlu);
	}
}

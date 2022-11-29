package cz.vutbr.feec.dsa.ls;

public class linSeznam {
	private Uzel prvni;
	
	public void pridej(int i) {
		Uzel nova = new Uzel();
		nova.setHodnota(i);
		nova.setDalsi(prvni);
		prvni = nova;
	}

	public boolean obsahuje(int hodnota) {
		Uzel temp = prvni;
		while(temp != null) {
			if(temp.getHodnota() == hodnota)
				return true;
			temp = temp.getDalsi();
		}
		return false;
	}
}

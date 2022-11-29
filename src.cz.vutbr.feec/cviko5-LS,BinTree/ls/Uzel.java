package cz.vutbr.feec.dsa.ls;

public class Uzel {
	private int hodnota;
	private Uzel dalsi;
	
	public int getHodnota() {
		return hodnota;
	}

	public void setHodnota(int hodnota) {
		this.hodnota = hodnota;		
	}

	public void setDalsi(Uzel dalsi) {
		this.dalsi = dalsi;
	}

	public Uzel getDalsi() {
		return dalsi;
	}
	
}

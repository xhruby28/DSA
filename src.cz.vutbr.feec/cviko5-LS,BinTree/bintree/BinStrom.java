package cz.vutbr.feec.dsa.bintree;

public class BinStrom {
	private Uzel koren;

	public void vlozit(int hodnota) {
		Uzel temp = koren;
		Uzel newTemp = new Uzel();
		
		if(koren == null) {
			newTemp.setHodnota(hodnota);
			koren = newTemp;
			return;
		}
		while (temp != null) {
			if(temp.getHodnota() == hodnota) {
				return;
			} else if(hodnota < temp.getHodnota()) {
				if(temp.getLevy() == null) {
					newTemp.setHodnota(hodnota);
					temp.setLevy(newTemp);
					return;
				} else {
					temp = temp.getLevy();
				}
			} else {
				if(temp.getPravy() == null) {
					newTemp.setHodnota(hodnota);
					temp.setPravy(newTemp);
					return;
				} else {
					temp = temp.getPravy();
				}
			}
		}
	}


	public boolean obsahuje(int hodnota) {
		Uzel temp = koren;
		while(temp != null) {
			if(temp.getHodnota() == hodnota)
				return true;
			
			if (hodnota < temp.getHodnota())
				temp = temp.getLevy();
			else
				temp = temp.getPravy();
		}
		return false;
	}
	
	public void inOrder() {
		System.out.println();
		inOrder(koren);
	}
	
	private void inOrder(Uzel uzel) {
		if(uzel == null)
			return;
		inOrder(uzel.getLevy());
		System.out.print(uzel.getHodnota() +" ");
		inOrder(uzel.getPravy());
	}
	
	public void preOrder() {
		System.out.println();
		preOrder(koren);
	}
	
	private void preOrder(Uzel uzel) {
		if(uzel == null)
			return;
		System.out.print(uzel.getHodnota() +" ");
		preOrder(uzel.getLevy());
		preOrder(uzel.getPravy());
	}
	
	public void postOrder() {
		System.out.println();
		postOrder(koren);
	}
	
	private void postOrder(Uzel uzel) {
		if(uzel == null)
			return;
		postOrder(uzel.getLevy());
		postOrder(uzel.getPravy());
		System.out.print(uzel.getHodnota() +" ");
	}
	
	// nejhlubsi uzel
	public void vyskaStromu() {
		vyskaStromu(koren);
	}
	
	private int vyskaStromu(Uzel uzel) {
		if(uzel == null)
			return 0;
		int levaVetev = vyskaStromu(uzel.getLevy());
		int pravaVetev = vyskaStromu(uzel.getPravy());
		return Math.max(levaVetev, pravaVetev) + 1;
	}
	
	public void nejhlubsi() {
		System.out.print("Nejnižší uzel je: ");
		nejhlubsi(koren, vyskaStromu(koren));
	}
	
	private void nejhlubsi(Uzel uzel, int vyska) {
		if(uzel == null)
			return;
		if (vyska == 1) {
			System.out.println(uzel.getHodnota());
		} else if(vyska > 1) {
			nejhlubsi(uzel.getLevy(), vyska - 1);
			nejhlubsi(uzel.getPravy(), vyska - 1);	
		}
	}
}

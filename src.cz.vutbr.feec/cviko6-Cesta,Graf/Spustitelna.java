package cz.vutbr.feec.dsa;

public class Spustitelna {

	public static void main(String[] args) {
		Graf g = new Graf();
		
		g.add("1", "2", 10);
		g.add("2", "3", 5);
		g.add("3", "1", 7);
		g.add("4", "1", 7);
		
		Cesta c = new Cesta(g);
		c.addVrchol("4");
		c.addVrchol("1");
		c.addVrchol("2");
		c.addVrchol("3");
		int cena = c.getCena();
		System.out.println(cena);
	}

}

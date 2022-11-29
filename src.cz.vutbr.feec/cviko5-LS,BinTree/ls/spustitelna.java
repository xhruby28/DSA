package cz.vutbr.feec.dsa.ls;

public class spustitelna {
	public static void main(String[] args) {
		linSeznam ls = new linSeznam();
		ls.pridej(10);
		ls.pridej(20);
		ls.pridej(10);
		ls.pridej(30);
		
		boolean obsahuje = ls.obsahuje(30);
		System.out.println(obsahuje);
	}
}

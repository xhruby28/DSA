package cz.vutbr.feec.dsa.bintree;

public class spustitelna {
	public static void main(String[] args) {
		BinStrom bs = new BinStrom();
		bs.vlozit(7);
		bs.vlozit(5);
		bs.vlozit(14);
		bs.vlozit(1);
		bs.vlozit(6);
		bs.vlozit(10);
		bs.vlozit(16);
		
		boolean obsahuje = bs.obsahuje(8);
		System.out.println(obsahuje);
		
		System.out.println(bs.obsahuje(10));
		
		bs.inOrder();
		bs.preOrder();
		bs.postOrder();
		
		bs.vlozit(13);
		
		System.out.println();
		
		bs.vyskaStromu();
		bs.nejhlubsi();
	}
}

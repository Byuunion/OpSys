package discDefrag;

public class Main {

	public static void main(String[] args) {
		final int diskSize = 10;
		DiscDefrag dd = new DiscDefrag(diskSize);
		
		DataBlock d1 = new DataBlock("A1", 4);
		DataBlock d2 = new DataBlock("A2", 6);
		DataBlock d3 = new DataBlock("A3", 10);
		DataBlock d4 = new DataBlock("B2", 2);
		DataBlock d5 = new DataBlock("B1", 5);
		DataBlock d6 = new DataBlock("C2", 1);
		DataBlock d7 = new DataBlock("C1", 8);
		DataBlock d8 = new DataBlock("D1", 9);
		DataBlock d9 = new DataBlock("E1", 3);
		DataBlock d10 = new DataBlock("F1", 7);
		
		dd.place(d1);
		dd.place(d2);
		dd.place(d3);
		dd.place(d4);
		dd.place(d5);
		dd.place(d6);
		dd.place(d7);
		dd.place(d8);
		dd.place(d9);
		dd.place(d10);
		
		dd.run();
	}

}

package discDefrag;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final int diskSize = 15;
		DiscDefrag dd = new DiscDefrag(diskSize);
		
		
		UniqueRandomNumbers uniqueRand = new UniqueRandomNumbers(0,15);
        ArrayList<Integer> uniqueRandList = uniqueRand.generate();
		
		dd.place(new DataBlock("A1",uniqueRandList.get(0)));	
		dd.place(new DataBlock("A2",uniqueRandList.get(1)));
		dd.place(new DataBlock("A3",uniqueRandList.get(2)));
		dd.place(new DataBlock("B1",uniqueRandList.get(3)));
		dd.place(new DataBlock("B2",uniqueRandList.get(4)));
		dd.place(new DataBlock("A4",uniqueRandList.get(5)));
		dd.place(new DataBlock("B4",uniqueRandList.get(6)));
		dd.place(new DataBlock("D1",uniqueRandList.get(7)));
		dd.place(new DataBlock("C1",uniqueRandList.get(8)));
		dd.place(new DataBlock("B3",uniqueRandList.get(9)));
		dd.place(new DataBlock("0", uniqueRandList.get(10)));
		dd.place(new DataBlock("0", uniqueRandList.get(11)));
		dd.place(new DataBlock("0", uniqueRandList.get(12)));
		dd.place(new DataBlock("1", uniqueRandList.get(13)));
		dd.place(new DataBlock("1", uniqueRandList.get(14)));
		                                               
		/*
		dd.place(new DataBlock("A1",0));
		dd.place(new DataBlock("B1",1));
		dd.place(new DataBlock("A2",2));
		dd.place(new DataBlock("C1",3));
		dd.place(new DataBlock("B2",4));
		dd.place(new DataBlock("C2",5));
		*/
		dd.run();
	}

}

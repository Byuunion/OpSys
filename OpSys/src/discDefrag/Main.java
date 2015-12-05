package discDefrag;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final int diskSize = 20;
		DiscDefrag dd = new DiscDefrag(diskSize);
		
		
		UniqueRandomNumbers uniqueRand = new UniqueRandomNumbers(0,diskSize);
        ArrayList<Integer> uniqueRandList = uniqueRand.generate();
		
		dd.place(new FilePart("A1",uniqueRandList.get(0)));	
		dd.place(new FilePart("A2",uniqueRandList.get(1)));
		dd.place(new FilePart("A3",uniqueRandList.get(2)));
		dd.place(new FilePart("B1",uniqueRandList.get(3)));
		dd.place(new FilePart("B2",uniqueRandList.get(4)));
		dd.place(new FilePart("A4",uniqueRandList.get(5)));
		dd.place(new FilePart("B4",uniqueRandList.get(6)));
		dd.place(new FilePart("D1",uniqueRandList.get(7)));
		dd.place(new FilePart("C1",uniqueRandList.get(8)));
		dd.place(new FilePart("B3",uniqueRandList.get(9)));
		dd.place(new FilePart("EMPTY", uniqueRandList.get(10)));
		dd.place(new FilePart("EMPTY", uniqueRandList.get(11)));
		dd.place(new FilePart("EMPTY", uniqueRandList.get(12)));
		dd.place(new FilePart("EMPTY", uniqueRandList.get(13)));
		dd.place(new FilePart("EMPTY", uniqueRandList.get(14)));
		dd.place(new FilePart("A5",uniqueRandList.get(15)));	
		dd.place(new FilePart("A6",uniqueRandList.get(16)));
		dd.place(new FilePart("B5",uniqueRandList.get(17)));
		dd.place(new FilePart("C2",uniqueRandList.get(18)));
		dd.place(new FilePart("D2",uniqueRandList.get(19)));
		                                               
		/*
		dd.place(new FilePart("A1",0));
		dd.place(new FilePart("B1",1));
		dd.place(new FilePart("A2",2));
		dd.place(new FilePart("C1",3));
		dd.place(new FilePart("B2",4));
		dd.place(new FilePart("C2",5));
		*/
		
		dd.run();
	}

}

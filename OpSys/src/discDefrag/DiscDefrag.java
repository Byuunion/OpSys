package discDefrag;

import java.util.LinkedList;

public class DiscDefrag {
	
	private int size;
	LinkedList<DataBlock> list = new LinkedList<DataBlock>();
	
	public DiscDefrag(int size){
		this.size = size;
		for(int i = 0; i < size; i++){
			//Adding stub entries to a linked list
			list.add(null);
		}
	}
	
	public void place(DataBlock d){
		//Simulates writing to a cell
		//Assumes datablock knows where it's located
		//DataBLock id 0 = empty, 1 = corrupted
		list.set(d.getLocation(), d);
	}
	
	//Removes element at index2 and Adds element at index2 in front of element at index1
	private void removeAddSwap(int index1, int index2){
		DataBlock temp = list.get(index2);
		list.remove(index2);
		list.add(index1+1, temp);
	}
	
	public void run(){
		System.out.println(list.toString());
		int count = 1;
		char letter;
		
		while(count < size){
			int count2 = 0;
			letter = list.get(count - 1).getId().charAt(0);
			
			//Check from position at the rest of the list to form continuity
			for(int i = count; i < size; i++){
				//Append match to current position to form continuity
				if(list.get(i).getId().charAt(0) == letter && Character.isLetter(list.get(i).getId().charAt(0))){
					//Temp, remove, add used to simulate constant disk space
					removeAddSwap(count, i);
					count2++;
				}
			}
			if(count == 0) count += 1;
			else count += count2;
		}
		System.out.println(list.toString());
		

	}
	
	

}

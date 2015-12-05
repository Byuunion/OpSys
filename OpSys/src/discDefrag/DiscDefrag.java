package discDefrag;

import java.util.LinkedList;

public class DiscDefrag {
	
	private int size;
	LinkedList<FilePart> list = new LinkedList<FilePart>();
	
	public DiscDefrag(int size){
		this.size = size;
		for(int i = 0; i < size; i++){
			//Adding stub entries to a linked list
			list.add(null);
		}
	}
	
	public void place(FilePart d){
		//Simulates writing to a cell
		//Assumes FilePart knows where it's located
		list.set(d.getlink(), d);
	}
	
	//Removes element at index2 and Adds element at index2 in front of element at index1
	private void removeAddSwap(int index1, int index2){
		FilePart temp = list.get(index2);
		list.remove(index2);
		list.add(index1, temp);
	}
	
	public void run(){
		System.out.println("Before: " + list.toString());
		int count = 0;
		char letter;
		
		while(count < size){
			int count2 = 0;
			letter = list.get(count).getId().charAt(0);
			
			//Check from position at the rest of the list to form continuity
			for(int i = count; i < size; i++){
				//Append match to current position to form continuity
				if(list.get(i).getId().charAt(0) == letter){
					//Temp, remove, add used to simulate constant disk space
					removeAddSwap(count, i);
					count2++;
				}
				if(list.get(i).getId() == "EMPTY"){
					FilePart temp = list.get(i);
					list.remove(i);
					list.add(temp);
				}
			}
			if(count2 == 0) count += 1;
			else count += count2;
		}
		
		System.out.println("After : " + list.toString());
		

	}
	
	

}

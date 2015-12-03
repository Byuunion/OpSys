package discDefrag;

import java.util.LinkedList;

public class DiscDefrag {
	
	private int size;
	LinkedList<DataBlock> list = new LinkedList<DataBlock>();
	
	public DiscDefrag(int size){
		this.size = size;
		for(int i = 0; i < size; i++){
			list.add(null);
		}
	}
	
	public void place(DataBlock d){
		list.add(d.getLocation(), d);
		list.remove(d.getLocation() - 1);
	}
	
	public void run(){
		System.out.println(list.toString());
		int count = 0;
		char letter;
		while(count != size){
			int count2 = 0;
			letter = list.get(count).getId().charAt(0);
			
			//Check from position at the rest of the list to form continuity
			for(int i = count; i < size; i++){
				//Append match to current position to form continuity
				if(list.get(i).getId().charAt(0) == letter){
					list.add(count, list.get(i));
					list.remove(i + 1);
					count2++;
				}
			}
			count += count2;
		}
		System.out.println(list.toString());

	}
	
	

}

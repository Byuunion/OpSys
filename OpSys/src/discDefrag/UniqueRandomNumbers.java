package discDefrag;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueRandomNumbers {
	int min, max;
	ArrayList<Integer> list;

    public UniqueRandomNumbers(int min, int max){
    	this.min = min;
    	this.max = max;
    	list = new ArrayList<Integer>();
    	for (int i = min; i < max; i++) {
            list.add(new Integer(i));
        }
    }
    
    public ArrayList generate(){
        Collections.shuffle(list);
        return list;
    }
}
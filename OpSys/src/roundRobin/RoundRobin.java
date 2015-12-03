package roundRobin;

import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin {
	long currentTime;
	private Queue<Process> q;
	private int qTime;
	
	public RoundRobin(int qTime){
		q = new LinkedList<Process>();
		this.qTime = qTime;
		currentTime = System.currentTimeMillis();
	}
	
	public void addProcess(Process p){
		q.add(p);
	}
	
	//remove from queue and return the element removed
	public Process removProcess(){
		return q.remove();
	}
	
	public void run(){
		
		while (q.size() > 0){
			if(q.peek().totalTime < qTime){
				currentTime += q.peek().totalTime;
				System.out.println(q.toString());
				System.out.println("System Time in ms: " + currentTime);
				q.remove();
			}
			
			else{
				q.peek().totalTime -= qTime;
				currentTime += qTime;
				System.out.println(q.toString());
				System.out.println("System Time in ms: " + currentTime);
				q.add(q.remove());
			}
			
		}
	}
}

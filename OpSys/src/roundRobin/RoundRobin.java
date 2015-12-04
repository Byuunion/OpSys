package roundRobin;

import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin {
	long currentTime;
	long startTime;
	private Queue<Process> q;
	private int qTime;
	
	public RoundRobin(int qTime){
		q = new LinkedList<Process>();
		this.qTime = qTime;
		currentTime = System.currentTimeMillis();
		startTime = System.currentTimeMillis();
	}
	
	public void add(Process p){
		q.add(p);
	}
	
	public void run(){
		System.out.println("Quantum time in ms is: " + qTime);
		
		while (q.size() > 0){
			if(q.peek().timeLeft < qTime){
				currentTime += q.peek().timeLeft;
				System.out.println(q.toString());
				System.out.println("Elapsed time in ms: " + (currentTime - startTime));
				q.remove();
			}
			
			else{
				q.peek().timeLeft -= qTime;
				currentTime += qTime;
				System.out.println(q.toString());
				System.out.println("System Time in ms: " + (currentTime - startTime));
				q.add(q.remove());
			}
			
		}
	}
}

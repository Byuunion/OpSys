package roundRobin;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int quantumTime = 25;
		
		RoundRobin rr = new RoundRobin(quantumTime);
		
		for (int i=0; i < 10; i++) {
		   rr.add(new Process(i, r.nextInt(100)+1));
		}
	
		rr.run();
	}

}

package roundRobin;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int quantumTime = r.nextInt(100) + 1;
		
		Process p1 = new Process(1,800);
		Process p2 = new Process(2,450);
		Process p3 = new Process(3,200);
		Process p4 = new Process(4,900);
		Process p5 = new Process(5,1500);
		
		RoundRobin rr = new RoundRobin(quantumTime);

		rr.addProcess(p1);
		rr.addProcess(p2);
		rr.addProcess(p3);
		rr.addProcess(p4);
		rr.addProcess(p5);
		
		rr.run();
	}

}

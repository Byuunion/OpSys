package roundRobin;

public class Process {
	int id;
	int timeLeft;

	public Process(int id, int time){
		this.id = id;
		this.timeLeft = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTime() {
		return timeLeft;
	}

	public void setTime(int time) {
		this.timeLeft = time;
	}

	@Override
	public String toString() {
		return "Process [" + id + "]";
	}
	
	
}

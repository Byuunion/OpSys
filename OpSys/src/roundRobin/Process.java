package roundRobin;

public class Process {
	int id;
	int totalTime;

	public Process(int id, int qTime){
		this.id = id;
		this.totalTime = qTime;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getqTime() {
		return totalTime;
	}

	public void setqTime(int qTime) {
		this.totalTime = qTime;
	}

	@Override
	public String toString() {
		return "Process [" + id + "]";
	}
	
	
}

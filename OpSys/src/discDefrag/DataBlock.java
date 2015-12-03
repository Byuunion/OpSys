package discDefrag;

public class DataBlock {
	
	private String id;
	private int location;
	
	public DataBlock(String id, int location){
		this.id = id;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "DataBlock[" + id + "]";
	}
	
}

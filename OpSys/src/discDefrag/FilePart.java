package discDefrag;

public class FilePart {
	private String id;
	private int link;
	
	public FilePart(String id, int link){
		this.id = id;
		this.link = link;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getlink() {
		return link;
	}

	public void setlink(int link) {
		this.link = link;
	}
	
	@Override
	public String toString() {
		return "DataBlock[" + id + "]";
	}
	
}
package model;

public class Work {
	private int wId;
	private String wName;
	private String wLocation;

	public int getwId() {
		return wId;
	}

	public void setwId(int wId) {
		this.wId = wId;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public String getwLocation() {
		return wLocation;
	}

	public void setwLocation(String wLocation) {
		this.wLocation = wLocation;
	}

	@Override
	public String toString() {
		return "Work [wId=" + wId + ", wName=" + wName + ", wLocation=" + wLocation + "]";
	}
	
	
}

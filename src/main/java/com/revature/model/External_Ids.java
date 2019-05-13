package com.revature.model;

public class External_Ids {

	private String isrc;

	public External_Ids() {}

	public External_Ids(String isrc) {
		super();
		this.isrc = isrc;
	}

	public String getIsrc() {
		return isrc;
	}

	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}

	@Override
	public String toString() {
		return "External_Ids [isrc=" + isrc + "]";
	}
	
	
}

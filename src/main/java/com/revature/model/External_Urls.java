package com.revature.model;

public class External_Urls {

	private String spotify;

	public External_Urls() {}

	public External_Urls(String spotify) {
		super();
		this.spotify = spotify;
	}

	public String getSpotify() {
		return spotify;
	}

	public void setSpotify(String spotify) {
		this.spotify = spotify;
	}

	@Override
	public String toString() {
		return "External_Urls [spotify=" + spotify + "]";
	}
	
	
	
}

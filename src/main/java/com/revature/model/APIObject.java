package com.revature.model;

public class APIObject {

	private Tracks tracks;

	public APIObject() {}

	public APIObject(Tracks tracks) {
		super();
		this.tracks = tracks;
	}

	public Tracks getTracks() {
		return tracks;
	}

	public void setTracks(Tracks tracks) {
		this.tracks = tracks;
	}

	@Override
	public String toString() {
		return "APIObject [tracks=" + tracks + "]";
	}
	
	
	
	
}

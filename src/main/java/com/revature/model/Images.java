package com.revature.model;

public class Images {

	private long height;
	private String url;
	private long width;
	
	public Images() {}

	public Images(long height, String url, long width) {
		super();
		this.height = height;
		this.url = url;
		this.width = width;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Images [height=" + height + ", url=" + url + ", width=" + width + "]";
	}
	
	
	
	
}

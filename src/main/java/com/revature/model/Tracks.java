package com.revature.model;

import java.util.Arrays;


public class Tracks {
	
	private String href;
	private Items[] items;
	private long limit;
	private String next;
	private long offset;
	private String previous;
	private long total;
	
	
	public Tracks() {}


	public Tracks(String href, Items[] items, long limit, String next, long offset, String previous, long total) {
		super();
		this.href = href;
		this.items = items;
		this.limit = limit;
		this.next = next;
		this.offset = offset;
		this.previous = previous;
		this.total = total;
	}


	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}


	public Items[] getItems() {
		return items;
	}


	public void setItems(Items[] items) {
		this.items = items;
	}


	public long getLimit() {
		return limit;
	}


	public void setLimit(long limit) {
		this.limit = limit;
	}


	public String getNext() {
		return next;
	}


	public void setNext(String next) {
		this.next = next;
	}


	public long getOffset() {
		return offset;
	}


	public void setOffset(long offset) {
		this.offset = offset;
	}


	public String getPrevious() {
		return previous;
	}


	public void setPrevious(String previous) {
		this.previous = previous;
	}


	public long getTotal() {
		return total;
	}


	public void setTotal(long total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "Tracks [href=" + href + ", items=" + Arrays.toString(items) + ", limit=" + limit + ", next=" + next
				+ ", offset=" + offset + ", previous=" + previous + ", total=" + total + "]";
	}

	
	
	
}

package com.fu.logVisualization.common;

public class Paging {

	private int page;
	private int start;
	private int limit;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@Override
	public String toString() {
		return "Paging [page=" + page + ", start=" + start + ", limit=" + limit + "]";
	}
	
}

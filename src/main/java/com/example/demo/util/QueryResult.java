package com.example.demo.util;
import java.util.List;
public class QueryResult {
	private int totalRecords;
	private List<Object> list;
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
}

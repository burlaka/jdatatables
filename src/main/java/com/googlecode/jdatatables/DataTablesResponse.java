package com.googlecode.jdatatables;

import java.util.ArrayList;
import java.util.List;


public class DataTablesResponse<T> {

	private String sEcho;

	private Integer iTotalRecords;

	private Long iTotalDisplayRecords;

	private List<T> aaData = new ArrayList<T>();

	public DataTablesResponse() {
	}

	public DataTablesResponse(String sEcho) {
		super();
		this.sEcho = sEcho;
	}

	public DataTablesResponse(String sEcho, Integer iTotalRecords, Long iTotalDisplayRecords, List<T> aaData) {
		this.sEcho = sEcho;
		this.iTotalRecords = iTotalRecords;
		this.iTotalDisplayRecords = iTotalDisplayRecords;
		this.aaData = aaData;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public Integer getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(Integer iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public Long getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(Long iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public List<T> getAaData() {
		return aaData;
	}

	public void setAaData(List<T> aaData) {
		this.aaData = aaData;
	}

}

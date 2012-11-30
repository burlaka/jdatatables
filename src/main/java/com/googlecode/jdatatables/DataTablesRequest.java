package com.googlecode.jdatatables;


public class DataTablesRequest {

	private Integer displayStart;

	private Integer displayLength;

	private Integer columns;

	private String globalSearch;

	private Boolean globalRegex;

	private Boolean[] searchable;

	private String[] search;

	private Boolean[] regex;

	private Boolean[] sortable;

	private Integer sortingCols;

	private Integer[] sortCol;

	private String[] sortDir;

	private String[] dataProp;

	private String sEcho;

	public DataTablesRequest() {
	}

	public Integer getDisplayStart() {
		return displayStart;
	}

	public void setDisplayStart(Integer displayStart) {
		this.displayStart = displayStart;
	}

	public Integer getDisplayLength() {
		return displayLength;
	}

	public void setDisplayLength(Integer displayLength) {
		this.displayLength = displayLength;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public String getGlobalSearch() {
		return globalSearch;
	}

	public void setGlobalSearch(String globalSearch) {
		this.globalSearch = globalSearch;
	}

	public Boolean getGlobalRegex() {
		return globalRegex;
	}

	public void setGlobalRegex(Boolean globalRegex) {
		this.globalRegex = globalRegex;
	}

	public Boolean[] getSearchable() {
		return searchable;
	}

	public void setSearchable(Boolean[] searchable) {
		this.searchable = searchable;
	}

	public String[] getSearch() {
		return search;
	}

	public void setSearch(String[] search) {
		this.search = search;
	}

	public Boolean[] getRegex() {
		return regex;
	}

	public void setRegex(Boolean[] regex) {
		this.regex = regex;
	}

	public Boolean[] getSortable() {
		return sortable;
	}

	public void setSortable(Boolean[] sortable) {
		this.sortable = sortable;
	}

	public Integer getSortingCols() {
		return sortingCols;
	}

	public void setSortingCols(Integer sortingCols) {
		this.sortingCols = sortingCols;
	}

	public Integer[] getSortCol() {
		return sortCol;
	}

	public void setSortCol(Integer[] sortCol) {
		this.sortCol = sortCol;
	}

	public String[] getSortDir() {
		return sortDir;
	}

	public void setSortDir(String[] sortDir) {
		this.sortDir = sortDir;
	}

	public String[] getDataProp() {
		return dataProp;
	}

	public void setDataProp(String[] dataProp) {
		this.dataProp = dataProp;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

}

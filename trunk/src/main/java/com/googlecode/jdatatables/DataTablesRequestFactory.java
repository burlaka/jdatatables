package com.googlecode.jdatatables;

import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;


public class DataTablesRequestFactory {

	public static DataTablesRequest getInstance(HttpServletRequest httpServletRequest) {
		DataTablesRequest dataTablesRequest = new DataTablesRequest();
		try {
			dataTablesRequest.setDisplayStart(Integer.valueOf(httpServletRequest.getParameter("iDisplayStart")));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("iDisplayStart is not an integer.", e);
		}

		try {
			dataTablesRequest.setDisplayLength(Integer.valueOf(httpServletRequest.getParameter("iDisplayLength")));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("iDisplayLength is not an integer.", e);
		}

		try {
			dataTablesRequest.setColumns(Integer.valueOf(httpServletRequest.getParameter("iColumns")));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("iColumns is not an integer.", e);
		}

		dataTablesRequest.setGlobalSearch(httpServletRequest.getParameter("sSearch"));

		try {
			dataTablesRequest.setGlobalRegex(Boolean.valueOf(httpServletRequest.getParameter("bRegex")));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("bRegex is not an boolean.", e);
		}

		try {
			dataTablesRequest.setSearchable(getBooleanArrayParameter(httpServletRequest, "bSearchable_"));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("bSearchable_ is not an boolean array.", e);
		}

		dataTablesRequest.setSearch(getStringArrayParameter(httpServletRequest, "sSearch_"));

		try {
			dataTablesRequest.setSearchable(getBooleanArrayParameter(httpServletRequest, "bRegex_"));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("bRegex_ is not an boolean array.", e);
		}

		try {
			dataTablesRequest.setSortable(getBooleanArrayParameter(httpServletRequest, "bSortable_"));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("bSortable_ is not an boolean array.", e);
		}

		try {
			dataTablesRequest.setSortingCols(Integer.valueOf(httpServletRequest.getParameter("iSortingCols")));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("iSortingCols is not an integer.", e);
		}

		try {
			dataTablesRequest.setSortCol(getIntArrayParameter(httpServletRequest, "iSortCol_"));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("iSortCol_ is not an integer array.", e);
		}

		dataTablesRequest.setSortDir(getStringArrayParameter(httpServletRequest, "sSortDir_"));
		dataTablesRequest.setDataProp(getStringArrayParameter(httpServletRequest, "mDataProp_"));
		dataTablesRequest.setsEcho(httpServletRequest.getParameter("sEcho"));
		return dataTablesRequest;
	}

	private static Integer[] getIntArrayParameter(HttpServletRequest httpServletRequest, String parameterName) {
		Enumeration<String> names = httpServletRequest.getParameterNames();
		int countOfParameters = 0;
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.contains(parameterName)) {
				++countOfParameters;
			}
		}

		Integer[] parameters = new Integer[countOfParameters];
		names = httpServletRequest.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.contains(parameterName)) {
				Integer value = Integer.valueOf(httpServletRequest.getParameter(name));
				Pattern pattern = Pattern.compile(parameterName + "(\\d+)");
				Matcher matcher = pattern.matcher(name);
				if (matcher.matches()) {
					int index = Integer.parseInt(matcher.group(1));
					parameters[index] = value;
				}
			}
		}
		return parameters;
	}

	private static String[] getStringArrayParameter(HttpServletRequest httpServletRequest, String parameterName) {
		Enumeration<String> names = httpServletRequest.getParameterNames();
		int countOfParameters = 0;
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.contains(parameterName)) {
				++countOfParameters;
			}
		}

		String[] parameters = new String[countOfParameters];
		names = httpServletRequest.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.contains(parameterName)) {
				String value = httpServletRequest.getParameter(name);
				Pattern pattern = Pattern.compile(parameterName + "(\\d+)");
				Matcher matcher = pattern.matcher(name);
				if (matcher.matches()) {
					int index = Integer.parseInt(matcher.group(1));
					parameters[index] = value;
				}
			}
		}
		return parameters;
	}

	private static Boolean[] getBooleanArrayParameter(HttpServletRequest httpServletRequest, String parameterName) {
		Enumeration<String> names = httpServletRequest.getParameterNames();
		int countOfParameters = 0;
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.contains(parameterName)) {
				++countOfParameters;
			}
		}

		Boolean[] parameters = new Boolean[countOfParameters];
		names = httpServletRequest.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			if (name.contains(parameterName)) {
				Boolean value = Boolean.valueOf(httpServletRequest.getParameter(name));
				Pattern pattern = Pattern.compile(parameterName + "(\\d+)");
				Matcher matcher = pattern.matcher(name);
				if (matcher.matches()) {
					int index = Integer.parseInt(matcher.group(1));
					parameters[index] = value;
				}
			}
		}
		return parameters;
	}

}

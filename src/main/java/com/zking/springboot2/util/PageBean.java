package com.zking.springboot2.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * 分页工具类
 *
 */
public class PageBean {

	private int page = 1;// 页码

	private int rows = 10;// 页大小

	private int total = 0;// 总记录数

	private boolean pagination = true;// 是否分页

	private String url;
	private Map<String, String[]> parametermap=new HashMap<String,String[]>();
	
	public Map<String, String[]> getParametermap() {
		return parametermap;
	}

	public void setParametermap(Map<String, String[]> parametermap) {
		this.parametermap = parametermap;
	}

	public PageBean() {
		super();
	}

	public void setRequest(HttpServletRequest request) {
		String page=request.getParameter("page");
		String rows=request.getParameter("rows");
		String pagination=request.getParameter("pagination");
		this.setPage(page);
		this.setPagination(pagination);
		this.setRows(rows);
		this.url=request.getContextPath()+"/"+request.getServletPath();
		this.parametermap=request.getParameterMap();
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	public void setPage(String page) {
		if(null!=page&&!"".equals(page.trim())) {
			this.page=Integer.parseInt(page);
		}
	}

	public int getRows() {
		return rows;
	}

	public void setRows(String rows) {
		if(null!=rows&&!"".equals(rows.trim())) {
			this.rows=Integer.parseInt(rows);
		}
	}


	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTotal(String total) {
		this.total = Integer.parseInt(total);
	}

	public boolean isPagination() {
		return pagination;
	}

	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	public void setPagination(String pagination) {
		if("false".equals(pagination)) {
			this.pagination = false;
		}
	}
	
	public int getPrePage() {
		int previousPage=this.page-1;
		if(0==previousPage) {
			previousPage=1;
		}
		return previousPage;
	}

	public int getNextPage() {
		int nextPage=this.page+1;
		if(nextPage>this.getMaxPage()) {
			nextPage=this.getMaxPage();
		}
		return nextPage;
	}
	/**
	 * 获得起始记录的下标
	 * 
	 * @return
	 */
	public int getStartIndex() {
		return (this.page - 1) * this.rows;
	}

	@Override
	public String toString() {
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
	}

	public int getMaxPage() {
		int maxPage=this.total/this.rows;
		if(0!=this.total%this.rows) {
			maxPage++;
		}
		return maxPage;
	}
	
	
	
	
}

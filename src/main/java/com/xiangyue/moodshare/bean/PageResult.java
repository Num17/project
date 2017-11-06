package com.xiangyue.moodshare.bean;

import java.util.List;

public class PageResult<T> {

	private Integer pageTotal;
	private List<T> rows;

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	@Override
	public String toString() {
		return "PageResult [pageTotal=" + pageTotal + ", rows=" + rows + "]";
	}

}

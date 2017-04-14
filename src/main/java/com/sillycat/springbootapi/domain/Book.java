package com.sillycat.springbootapi.domain;

import java.util.Date;

public class Book {

	public Long id;

	public String doubanId;

	public String title;

	public String url;

	public String status;

	public Date borrowDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoubanId() {
		return doubanId;
	}

	public void setDoubanId(String doubanId) {
		this.doubanId = doubanId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

}

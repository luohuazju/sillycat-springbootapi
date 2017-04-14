package com.sillycat.springbootapi.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BookDto {

	public Long id;
	public String bookId;
	public String title;
	public String url;
	public String status;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+08:00")
	public Date borrowDate;

}

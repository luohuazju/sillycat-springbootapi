package com.sillycat.springbootapi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String doubanId;

	public String title;

	public String url;

	public String status;

	@ManyToOne
	@JoinColumn(name = "owner_id")
	public Account owner;

	public Date onboardDate;

	@ManyToOne
	@JoinColumn(name = "borrower_id")
	public Account borrower;

	public Date borrowDate;

	public Book() {
	}

	public Book(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	

}

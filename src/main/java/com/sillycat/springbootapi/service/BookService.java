package com.sillycat.springbootapi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sillycat.springbootapi.domain.Book;

@Service
public class BookService {

	@Transactional(readOnly = true)
	public Book findOne(Long id) {
		return new Book();
	}
	
}

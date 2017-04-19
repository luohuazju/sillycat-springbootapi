package com.sillycat.springbootapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sillycat.springbootapi.domain.Book;
import com.sillycat.springbootapi.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Transactional(readOnly = true)
	public Optional<Book> findOne(Long id) {
		return bookRepository.findOne(id);
	}
	
}

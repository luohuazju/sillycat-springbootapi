package com.sillycat.springbootapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sillycat.springbootapi.domain.Book;
import com.sillycat.springbootapi.dto.BeanMapper;
import com.sillycat.springbootapi.dto.BookDto;
import com.sillycat.springbootapi.service.BookService;

@RestController
public class BookEndpoint {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/api/books/{id}", produces = MediaTypes.JSON_UTF_8)
	public BookDto listOneBook(@PathVariable("id") Long id) {
		Book book = bookService.findOne(id);
		return BeanMapper.map(book, BookDto.class);
	}

}

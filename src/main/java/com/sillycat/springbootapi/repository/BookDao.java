package com.sillycat.springbootapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sillycat.springbootapi.domain.Book;

public interface BookDao extends PagingAndSortingRepository<Book, Long> {

	
}

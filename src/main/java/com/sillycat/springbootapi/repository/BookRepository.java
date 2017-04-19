package com.sillycat.springbootapi.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sillycat.springbootapi.domain.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

	List<Book> findByOwnerId(Long ownerId, Pageable pageable);

	List<Book> findByBorrowerId(Long borrowerId, Pageable pageable);

}

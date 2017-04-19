package com.sillycat.springbootapi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sillycat.springbootapi.domain.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;

	@Test
	public void findByBorrowerId() {
		List<Book> books = bookRepository.findByBorrowerId(1L, new PageRequest(0, 10));
		assertThat(books).hasSize(0);
	}

}

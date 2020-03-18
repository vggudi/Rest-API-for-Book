package com.mojro.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.mojro.spring.dao.BookDAO;
import com.mojro.spring.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookDAO bookDAO;
	
	

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Book> getBooks() {
		List<Book> list = bookDAO.getAllBooks();
		return list;
	}

	@RequestMapping(value = "/book/{ISBN}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Book getBook(@PathVariable("ISBN") String ISBN) {
		return bookDAO.getBook(ISBN);
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody Book addBook(@RequestBody Book book) {
		return bookDAO.addBook(book);
		

	}

	/*
	 * @PostMapping(value = "/book") public ResponseEntity<?>
	 * addBook(@RequestBody Book book) {
	 * 
	 * bookDAO.addBook(book);
	 * 
	 * return new ResponseEntity<Book>(book, HttpStatus.OK); }
	 */

	@RequestMapping(value = "/book", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody Book updateBook(@RequestBody Book book) {

		return bookDAO.updateBook(book);
	}

	@RequestMapping(value = "/books/{ISBN}", //
			method = RequestMethod.DELETE, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteBook(@PathVariable("ISBN") String ISBN) {
		bookDAO.deleteBook(ISBN);
	}
}

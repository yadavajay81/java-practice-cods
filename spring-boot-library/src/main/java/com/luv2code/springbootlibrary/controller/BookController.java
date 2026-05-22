package com.luv2code.springbootlibrary.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springbootlibrary.entity.Book;
import com.luv2code.springbootlibrary.responsemodels.ShelfCurrentLoansResponse;
import com.luv2code.springbootlibrary.service.BookService;
import com.luv2code.springbootlibrary.utils.ExtractJWT;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("api/books")
public class BookController {
	
	private BookService bookService;

    private static final Logger log = LogManager.getLogger(BookController.class);
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/log")
    public String logExample() {
		log.info("Info level log example");
		log.debug("Debug level log example");
		log.error("Error level log example", new Exception("Example exception"));
        return "Logging has been demonstrated. Check the console and the log file!";
    }
	
	@GetMapping("/secure/currentloans")
	public List<ShelfCurrentLoansResponse> currentLoans(@RequestHeader(value = "Authorization") String token) 
	 throws Exception {
		String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		log.info("User Email: "+userEmail);
		return bookService.currentLoans(userEmail);
	}
	
	@GetMapping("/secure/currentloans/count")
	public int currentLoansCount(@RequestHeader(value = "Authorization") String token) {
		String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		return bookService.currentLoansCount(userEmail);
	}
	
	@GetMapping("/secure/ischeckedout/byuser")
	public Boolean checkoutBookByUser(@RequestHeader(value = "Authorization") String token, @RequestParam Long bookId) {
		String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		return bookService.checkoutBookByUser(userEmail, bookId);
	}
	
	@PutMapping("/secure/checkout")
	public Book checkoutBook(@RequestHeader(value = "Authorization") String token, @RequestParam Long bookId) throws Exception {
		String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		return bookService.checkoutBook(userEmail, bookId);
	}

}

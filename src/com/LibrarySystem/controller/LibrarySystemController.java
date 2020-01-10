package com.LibrarySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.LibrarySystem.model.Book;
import com.LibrarySystem.service.BookService;



@Controller
@RequestMapping("/library")
public class LibrarySystemController {

	@Autowired
	@Qualifier("computer")
	BookService computerService;
	
	@Autowired
	@Qualifier("novel")
	BookService novelService;
	
	
	
	//value and method to define what /getCompBook will do
	@RequestMapping(value = "/getCompBook", method = RequestMethod.GET)
	public ModelAndView getCompList() {
		ModelAndView modelView = new ModelAndView("comp-list");

		List<Book> books = computerService.getBooks();
		modelView.addObject("book", new Book());
		modelView.addObject("compList", books);
		
		return modelView;
	}
	
	//value and method to define what /getNovelBook will do
	@RequestMapping(value = "/getNovelBook", method = RequestMethod.GET)
	public ModelAndView getNovelList() {
		ModelAndView modelView = new ModelAndView("novel-list");

		List<Book> books = novelService.getBooks();
		modelView.addObject("novelList", books);
		
		return modelView;
	}
	
	//adding a new book post request with /saveCompBook
	@RequestMapping(value = "saveCompBook", method= RequestMethod.POST)
	public String saveCompBook(@ModelAttribute("book") Book book) {
		if(computerService.addBook(book))
			return "redirect:/library/getCompBook";
		else {
			return "ErrorPage";
		}
	}
	//updating book from /editBook
	@RequestMapping(value = "editBook")
	//RequestParam comes from comp-list.jsp
	public ModelAndView editBook(@RequestParam("bookId") int bookId) {
		ModelAndView mv = new ModelAndView("update-book");
		Book book = computerService.getBookById(bookId);
		mv.addObject("updatedBook", book);
		return mv;
	}
	
	@RequestMapping(value = "updateBook")
	public String updateBook(@ModelAttribute("book") Book book) {
		if (computerService.updateBook(book)) {
			return "redirect:/library/getCompBook";
		} else {
			return "ErrorPage";
		}
	}
	
}

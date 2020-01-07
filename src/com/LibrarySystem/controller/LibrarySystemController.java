package com.LibrarySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
}

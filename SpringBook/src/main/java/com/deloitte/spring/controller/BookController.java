package com.deloitte.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deloitte.spring.dao.BookDAO;
import com.deloitte.spring.entity.Book;

@Controller
public class BookController {
	BookDAO bdao;

	@Autowired
	BookController(BookDAO bdao) {
		this.bdao = bdao;
	}

	@GetMapping("/bookPage")
	public String getBookPage(Model model) {
		model.addAttribute("book", new Book(0, "", 0.0, ""));
		return "DisplayBook";
	}

	@GetMapping("/bookCrud")
	public String bookCrud(@RequestParam("sub") String sub, @RequestParam("bookId") int bookid,
			@RequestParam("bookName") String bookname, @RequestParam("price") double price,
			@RequestParam("author") String author, RedirectAttributes ra) {
		
		ra.addFlashAttribute("book", new Book(bookid, bookname, price, author));
		String val = "";
		if (sub.equals("Add_Book"))
			val = "addBook";
		else if (sub.equals("Delete_Book"))
			val = "deleteBook";
		else if (sub.equals("Modify_Book"))
			val = "updateBook";
		else
			val = "getBook";

		return "redirect:" + val;
	}

	@GetMapping("/addBook")
	public String addBook(@ModelAttribute("book") Book book) {
		bdao.insertBook(book);
		return "DisplayBook";
	}

	@GetMapping("/updateBook")
	public String updateBook(@ModelAttribute("book") Book book) {
		bdao.updateBook(book);
		return "DisplayBook";
	}

	@GetMapping("/deleteBook")
	public String deleteBook(@ModelAttribute("book") Book book) {
		bdao.deleteBook(book.getBookId());
		return "DisplayBook";
	}

	@GetMapping("/getBook")
	public String getBook(@ModelAttribute("book") Book book, Model model) {
		Book b = bdao.getBook(book.getBookId());
		model.addAttribute("book", b);
		return "DisplayBook";
	}
}

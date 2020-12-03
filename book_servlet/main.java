package com.bookstore.model.dao.book;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		BookDao dao=new BookDaoImpl();
		//List<Book>  books = dao.getAllBooks();
		//books.forEach(c->System.out.println(c));
	
	
	//insert 
		Book book = new Book("MQ12","spring in action","bar", new Date(), 590);
		dao.addBook(book);
	
	
	}

}

	package junit;
	import java.util.*;
	public interface BookDao
	{
		List<Book> getAllBooks();
		Book upBook( int id,int page );
		Book delBook( int id );
	    void addBook(Book book );
	}


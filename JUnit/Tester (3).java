package junit;

	import org.junit.After;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;

	public class Tester {
		private Book bookAssign;
		private BookDao bookDao;
		

		public void setUp() throws Exception {
			bookDao=new Method();
			bookAssign=new Book(1, "java", "Bates", 50);
		}
		
		public void getAllBookstest() {
			int k=bookDao.getAllBooks().size();
			Assert.assertEquals(1, k);
		
			
		}
		
		public void upBooktest() {
			Assert.assertNotNull(bookDao.upBook(1, 50));
			
		}

		public void delBooktest() {
			Assert.assertNotNull(bookDao.delBook(1));
			
		}

		public void addBooktest() {
			bookDao.addBook(bookAssign);
			int k=bookDao.getAllBooks().size();
			Assert.assertEquals(2, k);
			
		}

	}



	package junit;
	import java.util.*;
	public class Method implements BookDao{

	private Map<Integer,Book> Bookmap;
		
		private int id=0;
		
		public MethodImpl() {
			Bookmap=new HashMap<>();
			Bookmap.put(++id, new Book(id, "java", "bates", 100));
		}

		public List<Book> getAllBooks() {
			
			return new ArrayList<Book>(Bookmap.values());
		}

		

		public Book upBook(int id, int page) {
			if(Bookmap.get(id) != null)
			{
				Bookmap.get(id).setNoOfpages(page);
				return Bookmap.get(id);
			}
			
			return null;
		}

		public Book delBook(int id) {
			
			return Bookmap.remove(id);
		}

		public void addBook(Book book) {
			Bookmap.put(book.getId(), book);
			
			
		}
		
	}



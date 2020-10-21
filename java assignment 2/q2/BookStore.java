
	public class BookStore extends Book {

		Book books[] = { new Book("Java Seventh Edition", "Herbert Schildt", "007045351", 10),
				new Book("C Programming", "Dennis Ritchie", "007045352", 7),
				new Book("Data Structures", "Narasimha Karumanchi", "007045353", 9),
				new Book("Operating System", "Abraham", "007045354", 5),
				new Book("Web Technologies", "Uttam K. Roy", "007045355", 12),
				new Book("Java-The Complete Reference ", "Herbert Schildt", "007045356", 4) };

		public void sell(String bookTitle, int noOfCopies) {
			boolean b = false;
			for (int i = 0; i < books.length; i++) {
				if ((books[i].getBookTitle() == bookTitle) && noOfCopies <= books[i].getNumOfCopies()) {
					b = true;
					int copies = books[i].getNumOfCopies() - noOfCopies;
					books[i].setNumOfCopies(copies);
				}
			}
			if (b == false)
				System.out.println("Book not found..");
		}

		public void order(String isbn, int noOfCopies) {
			boolean b = false;
			for (int i = 0; i < books.length; i++) {
				if (books[i].getISBN() == isbn) {
					b = true;
					int copies = books[i].getNumOfCopies() + noOfCopies;
					books[i].setNumOfCopies(copies);
				}
			}
			if (b == false) {
				System.out.println("New Book is added....");
			}
		}

		public void display() {
			for (int i = 0; i < books.length; i++) {
				books[i].display();
			}
		}

}

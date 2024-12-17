package Controller;
import java.util.List;
import daointerface.BookDao;
import model.Books;
import java.util.ArrayList;


// this is going to be the logic for CRUD
public class BookDaoImpl implements BookDao {
	
	private ArrayList<Books> booksObj;
	public BookDaoImpl() {
		booksObj = new ArrayList<Books> ();
		// the book has 2 properties
		booksObj.add(new Books(1, "Twilight"));
		booksObj.add(new Books(2, "1984"));
		booksObj.add(new Books(3, "The Giver"));
	}
	
	@Override 
public List<Books> getAllBooks() {
	return this.booksObj;
}

	public Books getBooksByIsbn(int isbn) {
		return this.booksObj.get(isbn);
}

	@Override
	public void saveBook(Books book) {
		this.booksObj.add(book);
	}
	
@Override 
public void deleteBook(Books book) {
this.booksObj.remove(book);
}

}



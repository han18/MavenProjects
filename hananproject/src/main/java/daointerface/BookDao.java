package daointerface;
import java.util.List;
import model.Books;


// this is the array that will store new data
public interface BookDao {
	// creating an array with the books information
	List <Books> getAllBooks();
	Books getBooksByIsbn(int isbn);
	void saveBook(Books book);
	void deleteBook(Books book);
}



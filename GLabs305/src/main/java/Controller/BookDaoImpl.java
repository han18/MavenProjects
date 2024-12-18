//Having defined our BookDao interface, 
//let’s implement it. BookDaoImpl class will be our business layer.

package Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Daointerface.BookDao;
import Daointerface.ConnectionDAO;
import model.Books;

public class BookDaoImpl extends ConnectionDAO implements BookDao {

    @Override
    public void saveBook(List<Books> BookList) {
        try {
            Connection con = ConnectionDAO.getConnection();
            for (Books b : BookList) {
                String sqlQuery = "INSERT INTO books (isbn,bookName) VALUES (?,?)";
                PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
                prepStmt.setInt(1, b.getIsbn());
                prepStmt.setString(2, b.getBookName());
                int affectedRows = prepStmt.executeUpdate();
                System.out.println(affectedRows + " row(s) affected !!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Books> getAllBooks() {
        List<Books> bookList = new ArrayList<>();
        try {
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                Books b = new Books();
                b.setIsbn(rs.getInt("isbn"));
                b.setBookName(rs.getString("bookName"));
                bookList.add(b);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public boolean updateBook(Books book, int id) {
        try {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE books SET isbn=?, bookName=? WHERE id=?");
            ps.setInt(1, book.getIsbn());
            ps.setString(2, book.getBookName());
            ps.setInt(3, id);
            return ps.executeUpdate() == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteBook(int id) {
        try {
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM books WHERE id=?");
            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}


//Our BookDaoImpl class supports select, insert, update, and delete operations. 
//The business layer remains unaware of the actual persistence logic.

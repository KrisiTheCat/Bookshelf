package bg.smg;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> books;
    private int totalSoldBooks;
    private int totalProfit;

    Bookstore(){
        books = new ArrayList<>();
        totalSoldBooks = 0;
        totalProfit = 0;
    }

    void addBook(Book book){
        books.add(book);
    }

    void buyBook(String bookName, int quantity){
        for(Book book : books){
            if(book.getTitle() == bookName){
                Order order = new Order(book, quantity);
                totalSoldBooks += quantity;
                totalProfit += order.execute();
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getTotalSoldBooks() {
        return totalSoldBooks;
    }

    @Override
    public String toString() {
        String ans = "Books:\n";

        for(Book book : books) {
            ans += book.toString() + "\n-----------------------------\n";
        }
        ans += "totalSoldBooks: " + totalSoldBooks + "\ntotalProfit: " + totalProfit;
        return ans;
    }

    public int getTotalProfit() {
        return totalProfit;
    }
}

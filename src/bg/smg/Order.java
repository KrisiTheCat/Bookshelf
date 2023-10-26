package bg.smg;

public class Order {
    private Book book;
    private int quantity;

    Order(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    double execute(){
        book.buyTimes(quantity);
        return book.getPrice()*quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

package bg.smg;

public class Main {
    public static void main(String args[]){

        Author author = new Author("Rick", "Riordan", 40);
        Book b = new Book("Percy Jackson and the lightning thief",100, author, 2005, 10);
        Book b2 = new Book("Percy Jackson and the sea of monsters",100, author, 2006, 12);

        Bookstore bookstore = new Bookstore();
        bookstore.addBook(b);
        bookstore.addBook(b2);

        bookstore.buyBook("Percy Jackson and the lightning thief", 34);
        bookstore.buyBook("Percy Jackson and the sea of monsters", 34);
        bookstore.buyBook("Percy Jackson and the lightning thief", 66);

        System.out.println(bookstore.toString());
    }
}

package bg.smg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Bookstore bookstore = new Bookstore();
        inputBooks(bookstore);
        System.out.println(bookstore.toString());
    }

    public static void inputBooks(Bookstore bookstore) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many authors should I add?");
        int count = sc.nextInt();
        List<Author> authors = new ArrayList<Author>();
        for(int i = 0; i < count; i++){
            System.out.println("Please enter author with id=" + i + ": firstname lastname age");
            String firstname = sc.next();
            String lastname = sc.next();
            int age = sc.nextInt();
            Author author = new Author(firstname, lastname, age);
            authors.add(author);
        }
        System.out.println("How many books should I add?");
        count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println("Please enter book: type title pages authorId yearOfPublishing price");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            String title = sc.next();
            int pages = sc.nextInt();
            int authorId = sc.nextInt();
            int yearOfPublishing = sc.nextInt();
            double price = sc.nextDouble();
            Book b;
            switch(type){
                case COMIC_BOOK:
                    System.out.println("Please enter characterName");
                    String characterName = sc.next();
                    b = new ComicBook(title, pages, authors.get(authorId), yearOfPublishing, price, characterName);
                    break;
                case CHILDREN_BOOK:
                    System.out.println("Please enter age");
                    int age = sc.nextInt();
                    b = new ChildrenBook(title, pages, authors.get(authorId), yearOfPublishing, price, age);
                    break;
                default:
                    b = new Book(title, pages, authors.get(authorId), yearOfPublishing, price);
                    break;
            }
            bookstore.addBook(b);
        }
        System.out.println("How many orders should I add?");
        count = sc.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println("Please enter order: bookName quantity");
            String bookName = sc.next();
            int quantity = sc.nextInt();
            bookstore.buyBook(bookName, quantity);
        }
    }

    /*
    2
    Rick Riordan 40
    Hristina Vandeva 17

    3
    BOOK PercyJacksonAndTheLightningThief 100 0 2005 10
    BOOK PercyJacksonAndTheSeaOfMonsters 100 0 2006 10
    COMIC_BOOK Donaldus 718 1 2007 16
    DonaldDuck

    1
    Donaldus 102
     */
    public static void hardCodedBooks(Bookstore bookstore){
        Author author = new Author("Rick", "Riordan", 40);
        Book b = new Book("Percy Jackson and the lightning thief",100, author, 2005, 10);
        bookstore.addBook(b);

        Book b2 = new Book("Percy Jackson and the sea of monsters",100, author, 2006, 12);
        bookstore.addBook(b2);

        Author author2 = new Author("Hristina", "Vandeva", 17);
        Book b3 = new ComicBook("Donaldus", 718, author, 2007, 16, "Donald Duck");
        bookstore.addBook(b);

        bookstore.buyBook("Percy Jackson and the lightning thief", 34);
        bookstore.buyBook("Percy Jackson and the sea of monsters", 34);
        bookstore.buyBook("Percy Jackson and the lightning thief", 66);
        bookstore.buyBook("Donaldus", 13);
    }
}

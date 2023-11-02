package bg.smg;

public class Book {
    private String title;
    private int pages;
    private Author author;
    private boolean isBestseller;
    private int yearPublishing;
    private double price;
    private int startQuantity = 0;
    private int quantity = 0;
    private BookType bookType;

    Book(){
        title = "";
        pages = 0;
        author = new Author();
        isBestseller = false;
        yearPublishing = 0;
        price = 0;
        quantity = 0;
        bookType = BookType.BOOK;
    }

    Book(String title, int pages, Author author, int yearPublishing, double price, int quantity) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.author.publishNewBook(this);
        this.isBestseller = false;
        this.yearPublishing = yearPublishing;
        this.price = price;
        this.quantity = quantity;
        this.startQuantity = quantity;
        bookType = BookType.BOOK;
    }

    public double buyTimes(int quantity){
        if(this.quantity < quantity){
            System.out.println("Unavailable!");
            return 0;
        }
        this.quantity -= quantity;
        if(this.startQuantity - this.quantity >= 100){
            makeBestseller();
        }
        return quantity*price;
    }

    @Override
    public String toString() {
        String ans =  "\"" + title + '\"';
        ans += " by " + author.getFirstName() + " " + author.getLastName();
        if(isBestseller) ans+= " *bestseller*";
        ans += "\n\t" + pages + " pages";
        ans += "\n\tpublshed " + yearPublishing;
        ans += "\n\tcosts $" + price;
        ans += "\n\tleft: " + quantity + "/" + this.startQuantity;
        return ans;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(double priceReduction) {
        return price*priceReduction;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
        this.author.publishNewBook(this);
    }

    public boolean isBestseller() {
        return isBestseller;
    }

    public void makeBestseller() {
        isBestseller = true;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}

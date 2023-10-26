package bg.smg;

public class Book {
    private String title;
    private int pages;
    private Author author;
    private boolean isBestseller;
    private int yearPublishing;
    private double price;
    private int quantity = 0;

    Book(){
        title = "";
        pages = 0;
        author = new Author();
        isBestseller = false;
        yearPublishing = 0;
        price = 0;
        quantity = 0;
    }

    Book(String title, int pages, Author author, int yearPublishing, double price) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.author.publishNewBook(this);
        this.isBestseller = false;
        this.yearPublishing = yearPublishing;
        this.price = price;
        this.quantity = 0;
    }

    public void buyTimes(int quantity){
        this.quantity += quantity;
        if(this.quantity >= 100){
            makeBestseller();
        }
    }

    @Override
    public String toString() {
        String ans =  "\"" + title + '\"';
        ans += " by " + author.getFirstName() + " " + author.getLastName();
        if(isBestseller) ans+= " *bestseller*";
        ans += "\n\t" + pages + " pages";
        ans += "\n\tpublshed " + yearPublishing;
        ans += "\n\tcosts $" + price;
        ans += "\n\tbought " + quantity + " times";
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

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}

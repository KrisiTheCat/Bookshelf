package bg.smg;

public class Author {
    private int publishedBooks;
    private String firstName;
    private String lastName;
    private int age;
    private int publishingExp;

    Author(){

    }

    Author(String firstName, String lastName, int age) {
        this.publishedBooks = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.publishingExp = 0;
    }

    void publishNewBook(Book book){
        publishedBooks++;
        publishingExp = Math.max(publishingExp, 2023-book.getYearPublishing());
    }

    public int getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(int publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPublishingExp() {
        return publishingExp;
    }
}

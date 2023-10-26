package bg.smg;

public class ChildrenBook extends Book{
    private int age;

    public ChildrenBook() {
        this.age = 0;
        super.setBookType(BookType.CHILDREN_BOOK);
    }

    public ChildrenBook(String title, int pages, Author author, int yearPublishing, double price, int age) {
        super(title, pages, author, yearPublishing, price);
        this.age = age;
        super.setBookType(BookType.CHILDREN_BOOK);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.7;
    }

    @Override
    public String toString() {
        String ans =  super.toString();
        ans += "\n\tappropriate " + age;
        return ans;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

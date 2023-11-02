package bg.smg;

public class ComicBook extends Book{
    private String characterName;

    public ComicBook() {
        this.characterName = "";
        super.setBookType(BookType.COMIC_BOOK);
    }

    public ComicBook(String title, int pages, Author author, int yearPublishing, double price, String characterName, int quantity) {
        super(title, pages, author, yearPublishing, price, quantity);
        this.characterName = characterName;
        super.setBookType(BookType.COMIC_BOOK);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.6;
    }

    @Override
    public String toString() {
        String ans =  super.toString();
        ans += "\n\twith character " + characterName;
        return ans;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}

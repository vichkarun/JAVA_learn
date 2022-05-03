package task_03;

public class Book {

    private final String name;
    private final String author;
    private final int countOfPage;
    private final int ISBNnumber;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public int getISBNnumber() {
        return ISBNnumber;
    }

    public Book(String name, String author, int countOfPage, int ISBNnumber) {
        this.name = name;
        this.author = author;
        this.countOfPage = countOfPage;
        this.ISBNnumber = ISBNnumber;
    }

}

package th1.accessory;

public class Book {
    private String title;
    private String author;
    private String pageNumber;
    private String size;

    public Book() {
    }

    public Book(String title, String author, String pageNumber, String size) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void display() {
        System.out.println(title + " " + author + " " + pageNumber + " " + size);
    }
}

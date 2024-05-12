package th1.accessory;

import java.util.ArrayList;

public class Table {
    private float height;
    private float width;
    private float length;
    private String material;
    private ArrayList<Book> books;
    private Lamp lamp;

    public Table() {
        books = new ArrayList<>();
        lamp = new Lamp();
    }

    public Table(float height, float width, float length, String material, ArrayList<Book> books, Lamp lamp) {
        this();
        this.height = height;
        this.width = width;
        this.length = length;
        this.material = material;
        this.books = books;
        this.lamp = lamp;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Lamp getLamps() {
        return lamp;
    }

    public void setLamps(Lamp lamps) {
        this.lamp = lamps;
    }

    public void addBook(Book b) {
        // Thêm book vào mảng
        books.add(b);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void switchLamp() {
        this.lamp.switchLamp();
    }

    public void displayBooks() {
        for (Book book : books) {
            book.display();
        }

    /* for(Book b:books){
        b.display();
       }
    */
    }
}

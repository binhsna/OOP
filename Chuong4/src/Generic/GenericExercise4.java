package Generic;

import java.util.ArrayList;
import java.util.List;

class GenericExercise4 {
    public static void main(String[] args) {
        Bookshelf<Book> b = new Bookshelf<>();
        Book b1 = new Book();
        b1.author = "Nguyen Cong Binh";
        b1.title = "Toan hoc tinh toan";
        b1.size = "40x60";
        b1.pages = 1000;
        b.putItems(b1);

        Book b2 = new Book();
        b2.author = "Nguyen Cong Binh";
        b2.title = "Logic hoc";
        b2.size = "50x50";
        b2.pages = 300;
        b.putItems(b2);

        System.out.println(b.getItemByTitle("Toan hoc tinh toan"));
    }
}

abstract class Document {
    String title;
    int pages;
    String size;

    public abstract void print();
}

class Book extends Document {
    String author;

    @Override
    public void print() {
        System.out.println("print the book");
    }
}

class Magazine extends Document {
    String publisher;

    @Override
    public void print() {
        System.out.println("print the magazine");
    }
}

class Bookshelf<T extends Document> {
    List<T> items;
    int num = 0;

    public Bookshelf() {
        items = new ArrayList<T>();
    }

    public void putItems(T t) {
        items.add(t);
        num++;
    }

    public T getItemByTitle(String title) {
        for (int i = 0; i < num; i++) {
            if (items.get(i).title == title) {
                return items.get(i);
            }
        }
        return null;
    }
}

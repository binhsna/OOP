package th1;

import th1.accessory.Book;
import th1.accessory.Lamp;
import th1.accessory.Table;

public class TH1Run {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Logic đại cương");
        book.setAuthor("Nguyễn Công Bình");
        book.setPageNumber("300");
        book.setSize("50x100");
        //book.display();
        Book book2 = new Book("Lý thuyết đồ thị", "Nguyễn Công Bình", "200", "20x25");
        //book2.display();
        Book book3 = new Book("Mathematical", "Nguyễn Công Bình", "150", "40x60");
        //book3.display();
        Lamp lamp = new Lamp(30, "A", false);
        Table table = new Table();
        table.addBook(book);
        table.addBook(book2);
        table.addBook(book3);
        table.displayBooks();
        table.switchLamp();
    }
}
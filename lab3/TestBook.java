package ru.mirea.lab3;
import ru.mirea.lab3.Book;
public class TestBook {
    public static void main(String[] args) {
        Book b = new Book("Стивен Кинг","ОНО", 1986);
       // System.out.println(b.getAuthor());
       // System.out.println(b.getTitle());
       // System.out.println(b.getYear());
        System.out.println(b);
    }
}

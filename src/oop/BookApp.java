package oop;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 464, false);
        Book book2 = new Book("The Pragmatic Programmer", "Andrew Hunt", 352, false);
        Book book3 = new Book("Effective Java", "Joshua Bloch", 416, false);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        book2.markAsRead();

        System.out.println(book2.toString());

        book2.setPages(500);

        System.out.println(book2.getPages());

    }
}

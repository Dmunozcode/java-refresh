package oop;
import java.util.Scanner;
import java.util.ArrayList;

public class BookApp {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do{
            showMenu();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    addBook(books, scanner);
                    break;
                case 2:
                    listBooks(books);
                    break;
                case 3:
                    searchBook(books, scanner);
                    break;
                case 4:
                    deleteBook(books,scanner);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while(option != 5);

        System.out.println("Exiting app...");
        scanner.close();
    }
    public static void showMenu(){
        System.out.println("1. Add a book ");
        System.out.println("2. List books ");
        System.out.println("3. Search a book ");
        System.out.println("4. Delete a book ");
        System.out.println("5. Exit ");
    }
    public static void addBook(ArrayList<Book> books, Scanner scanner){
        scanner.nextLine();
        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();
        System.out.println("Pages: ");
        int pages = scanner.nextInt();
        Book book = new Book(title, author, pages);
        books.add(book);
        System.out.println("Book add successfully");
    }
    public static void listBooks(ArrayList<Book> books){
        if(books.isEmpty()){
            System.out.println("Empty list");
        }else{
            for(Book book1 : books){
                System.out.println(book1);
            }
        }
    }
    public static void searchBook(ArrayList<Book> books, Scanner scanner){
        Book bookToShow = null;
        scanner.nextLine();
        System.out.println("Title");
        String title = scanner.nextLine();
        for (Book book1 : books){
            if(book1.getTitle().equalsIgnoreCase(title)){
                bookToShow = book1;
            }
        }
        if(bookToShow != null){
            System.out.println(bookToShow);
        }else{
            System.out.println("Book not found");
        }
    }
    public static void deleteBook(ArrayList<Book> books, Scanner scanner){
        Book bookToRemove = null;
        scanner.nextLine();
        System.out.println("Title: ");
        String title = scanner.nextLine();
        for (Book book1 : books){
            if (book1.getTitle().equalsIgnoreCase(title)){
                bookToRemove = book1;
            }
        }
        if(bookToRemove != null){
            books.remove(bookToRemove);
            System.out.println("Book removed");
        }else{
            System.out.println("Book not found");
        }
    }

}

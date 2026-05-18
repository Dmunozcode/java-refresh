package oop;

public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean read;

    public Book(String title, String author, int pages, boolean read) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.read = read;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.read = false;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", read=" + read +
                '}';
    }
    public void markAsRead(){
        this.read = true;
    }
}


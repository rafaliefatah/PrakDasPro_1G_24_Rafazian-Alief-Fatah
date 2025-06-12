package Praktikum14;

public class Book23 {
    public String isbn, title;

    public Book23() {
    }

    public Book23(String isbn, String title) {
        this.isbn=isbn;
        this.title=title;
    }

    public String toString() {
        return "ISBN: "+this.isbn+" Title: "+this.title;
    }
}
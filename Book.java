package Lab04;

import java.time.LocalDate;

public class Book {
    private static int count = 0;
    private int ID;
    private String title;
    private LocalDate Date;
    private double price;

    public Book() {
        this("", 0, 0, 0, 0);
    }

    public Book(String title, int year, int month, int day, double price) {
        ID = ++count;
        this.title = title;
        this.Date = LocalDate.of(year, month, day);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String gettitle() {
        return title;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void print() {
        System.out.println("ID= " + ID + "\ntitle= " + title + "\nprice= " + price + "\nDate= " + Date);

    }

}

class Textbook extends Book {
    private int pages;

    Textbook() {
        this(0, "", 0, 0, 0, 0);
    }

    Textbook(int pages, String title, int year, int month, int day, double price) {
        super(title, year, month, day, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void print() {
        super.print();
        System.out.println(pages);
        ;
    }

}

class Audiobook extends Book {
    private double min;

    Audiobook() {
        this(0, "", 0, 0, 0, 0);
    }

    Audiobook(double min, String title, int year, int month, int day, double price) {
        super(title, year, month, day, price);
        this.min = min;
    }

    public double getMin() {
        return min;
    }

    public void print() {
        super.print();
        System.out.println(min);
        ;
    }

}
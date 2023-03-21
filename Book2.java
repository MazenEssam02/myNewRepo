package Lab04;

import java.time.LocalDate;

public class Book2 {
    private static int count = 0;
    private int ID;
    private String title;
    private LocalDate Date;
    private double price;

    public Book2() {
        this("", 1, 1, 1, 0);
    }

    public Book2(String title, int year, int month, int day, double price) {
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
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "ID= " + ID + "\ntitle= " + title + "\nprice= " + price + "\nDate= " + Date;
    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1)
            return true;
        if (!(obj1 instanceof Book2))
            return false;
        Book2 obj = (Book2) obj1;
        if (this.title.equalsIgnoreCase(obj.title)
                && this.Date.equals(obj.Date))
            return true;

        return false;
    }

}

class Textbook2 extends Book2 {
    private int pages;

    Textbook2() {
        this(0, "", 0, 0, 0, 0);
    }

    Textbook2(int pages, String title, int year, int month, int day, double price) {
        super(title, year, month, day, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @override
    public String tostring() {
        return super.tostring() + "\n Pages= " + pages;

    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1)
            return true;
        if (!(obj1 instanceof Textbook2))
            return false;
        if (super.equals(obj1) == false)
            return false;

        Textbook2 obj = (Textbook2) obj1;
        if (this.pages == obj.pages)
            return true;

        return false;
    }

}

class Audiobook2 extends Book2 {
    private double min;

    Audiobook2() {
        this(0, "", 0, 0, 0, 0);
    }

    Audiobook2(double min, String title, int year, int month, int day, double price) {
        super(title, year, month, day, price);
        this.min = min;
    }

    public double getMin() {
        return min;
    }

    @override
    public String tostring() {
        return super.tostring() + "\n Minutes= " + min;

    }

    @Override
    public boolean equals(Object obj1) {
        if (this == obj1)
            return true;
        if (!(obj1 instanceof Audiobook2))
            return false;
        if (super.equals(obj1) == false)
            return false;

        Audiobook2 obj = (Audiobook2) obj1;
        if (this.min == obj.min)
            return true;

        return false;
    }

}
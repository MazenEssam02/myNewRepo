package Lab04;

import java.util.Scanner;

public class Testbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Books");
        int x = in.nextInt();

        Book[] arr = new Book[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter the Type of the Book (Text(T),Audio(A))");
            String type = in.next();
            System.out.println("Enter the Price");
            double price = in.nextDouble();
            System.out.println("Enter the Title of the book");
            String title = in.next();
            System.out.println("Enter the month");
            int month = in.nextInt();
            System.out.println("Enter the year");
            int year = in.nextInt();
            System.out.println("Enter the day");
            int day = in.nextInt();

            if (type.equalsIgnoreCase("Text") || type.equalsIgnoreCase("T")) {
                System.out.println("Enter the Number of Pages");
                int noPages = in.nextInt();
                arr[i] = new Textbook(noPages, title, year, month, day, price);

            } else if (type.equalsIgnoreCase("Audio") || type.equalsIgnoreCase("A")) {
                System.out.println("Enter the time in minutes");
                Double min = in.nextDouble();
                arr[i] = new Audiobook(min, title, year, month, day, price);
            }

            else {
                System.out.println("No choice");
            }
        }
        for (int j = 0; j < x; j++) {
            System.out.println("---------------------");
            arr[j].print();
            System.out.println("---------------------");
        }
    }

}

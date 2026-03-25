class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Main51 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 499.0);
        b1.display();
    }
}
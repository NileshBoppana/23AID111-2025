class Book {
    public String title;
    public String author;

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Wings of Fire";
        b1.author = "A.P.J Abdul Kalam";

        Book b2 = new Book();
        b2.title = "The Alchemist";
        b2.author = "Paulo Coelho";

        b1.display();
        b2.display();
    }
}
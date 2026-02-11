import java.util.Scanner;

class Book {
    public String title;
    public String author;

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            books[i] = new Book();
            System.out.print("Enter title: ");
            books[i].title = sc.nextLine();
            System.out.print("Enter author: ");
            books[i].author = sc.nextLine();
        }

        System.out.print("Enter title to search: ");
        String searchTitle = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(searchTitle)) {
                books[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }
}
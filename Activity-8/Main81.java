interface Printer {
    void print();
}

class TextPrinter implements Printer {
    public void print() {
        System.out.println("Printing text document...");
    }
}

class ImagePrinter implements Printer {
    public void print() {
        System.out.println("Printing image...");
    }
}

public class Main81 {
    public static void main(String[] args) {
        TextPrinter t = new TextPrinter();
        ImagePrinter i = new ImagePrinter();

        t.print();
        i.print();
    }
}
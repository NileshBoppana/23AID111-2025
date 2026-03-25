class Mobile {
    String brand;
    double price;

    Mobile(String b) {
        brand = b;
        price = 0;
    }

    Mobile(String b, double p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Main56 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("Apple", 80000);

        System.out.println("Mobile 1:");
        m1.display();

        System.out.println("Mobile 2:");
        m2.display();
    }
}
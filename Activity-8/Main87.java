interface Booking {
    void bookRide();
}

interface Payment {
    void processPayment();
}

class RideService implements Booking, Payment {
    public void bookRide() {
        System.out.println("Ride booked successfully!");
    }

    public void processPayment() {
        System.out.println("Payment processed successfully!");
    }
}

public class Main87 {
    public static void main(String[] args) {
        RideService ride = new RideService();

        ride.bookRide();
        ride.processPayment();
    }
}
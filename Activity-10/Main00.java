class TicketBookingSystem {
    private int availableSeats = 5;
    public synchronized void bookTicket(String user, int seatsRequested) {
        System.out.println(user + " trying to book " + seatsRequested + " seats.");
        if (seatsRequested <= availableSeats) {
            System.out.println("Booking successful for " + user);
            availableSeats -= seatsRequested;
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + user + " (Not enough seats)");
        }
        System.out.println();
    }
}
class User extends Thread {
    TicketBookingSystem system;
    String userName;
    int seats;
    User(TicketBookingSystem system, String userName, int seats) {
        this.system = system;
        this.userName = userName;
        this.seats = seats;
    }
    public void run() {
        system.bookTicket(userName, seats);
    }
}
public class Main00 {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        User u1 = new User(system, "Alice", 2);
        User u2 = new User(system, "Bob", 3);
        User u3 = new User(system, "Charlie", 2);
        u1.start();
        u2.start();
        u3.start();
    }
}
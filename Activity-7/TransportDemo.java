class Vehicle {
    String brand;
    int speed;

    void getVehicleData(String b, int s) {
        brand = b;
        speed = s;
    }

    void showVehicleData() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Bus extends Vehicle {
    int seats;

    void getBusData(int seats) {
        this.seats = seats;
    }

    void showBusData() {
        showVehicleData();
        System.out.println("Number of Seats: " + seats);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    void getTruckData(double cap) {
        loadCapacity = cap;
    }

    void showTruckData() {
        showVehicleData();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

public class TransportDemo {
    public static void main(String[] args) {

        Bus b = new Bus();
        b.getVehicleData("Volvo", 90);
        b.getBusData(45);

        Truck t = new Truck();
        t.getVehicleData("Tata", 70);
        t.getTruckData(12.5);

        System.out.println("=== Bus Details ===");
        b.showBusData();

        System.out.println("\n=== Truck Details ===");
        t.showTruckData();
    }
}
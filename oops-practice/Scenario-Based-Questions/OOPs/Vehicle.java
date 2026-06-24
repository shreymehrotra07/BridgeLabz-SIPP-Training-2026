class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;
    
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("\nCars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP93A101", "Harsh", "Car");
        vehicles[1] = new Vehicle("UP93B102", "Prakhar", "Bike");
        vehicles[2] = new Vehicle("UP93C103", "Kush", "Car");
        vehicles[3] = new Vehicle("UP93D104", "Kartikey", "Bike");
        vehicles[4] = new Vehicle("UP93E105", "Aman", "Car");
        vehicles[5] = new Vehicle("UP93F106", "Abhishek", "Bike");
        vehicles[6] = new Vehicle("UP93G107", "Shrey", "Car");
        vehicles[7] = new Vehicle("UP93H108", "Tanuj", "Bike");
        vehicles[8] = new Vehicle("UP93I109", "Harendra", "Car");
        vehicles[9] = new Vehicle("UP93J110", "Atul", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
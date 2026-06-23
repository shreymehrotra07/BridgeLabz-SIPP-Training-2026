import java.util.Scanner;

class ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parkingCapacity = 10;
        int occupiedSlots = 0;

        while (occupiedSlots < parkingCapacity) {
            System.out.println("\n===== Parking Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupiedSlots < parkingCapacity) {
                        occupiedSlots++;
                        System.out.println("Vehicle Parked Successfully.");
                    } else {
                        System.out.println("Parking Lot Full.");
                    }
                    break;

                case 2:
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle Exited Successfully.");
                    } else {
                        System.out.println("Parking Lot Empty.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots : " + occupiedSlots);
                    System.out.println("Available Slots : " + (parkingCapacity - occupiedSlots));
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }

            if (occupiedSlots == parkingCapacity) {
                System.out.println("\nParking Lot is Full.");
                break;
            }
        }

        sc.close();
    }
}
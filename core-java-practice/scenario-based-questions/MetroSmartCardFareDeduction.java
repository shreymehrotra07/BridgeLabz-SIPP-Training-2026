import java.util.Scanner;

class MetroSmartCardFareDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double smartCardBalance = 200.0;

        while (smartCardBalance > 0) {
            System.out.println("\nCurrent Balance: ₹" + smartCardBalance);
            System.out.print("Enter Distance Travelled (in km): ");
            int distance = sc.nextInt();

            double fare = (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;

            if (fare > smartCardBalance) {
                System.out.println("Insufficient Balance!");
                break;
            }
            smartCardBalance -= fare;

            System.out.println("Fare Deducted : ₹" + fare);
            System.out.println("Remaining Balance : ₹" + smartCardBalance);

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro Smart Card.");
        sc.close();
    }
}
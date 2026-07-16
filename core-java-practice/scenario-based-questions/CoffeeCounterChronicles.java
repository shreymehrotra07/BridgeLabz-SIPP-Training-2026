import java.util.Scanner;

class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter coffee type (or 'exit' to quit): ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            double price = 0.0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 2.5;
                    break;
                case "latte":
                    price = 3.5;
                    break;
                case "cappuccino":
                    price = 3.0;
                    break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue; 
            }

            double totalBill = price * quantity;
            double gst = totalBill * 0.18; 
            double finalAmount = totalBill + gst;
            
            System.out.println("========= Total Bill =========");
            System.out.println("Coffee Type    : " + coffeeType);
            System.out.println("Quantity       : " + quantity);
            System.out.println("Price          : " + price);
            System.out.println("Total Bill     : " + totalBill);
            System.out.printf("GST (18%%)      : %.2f\n", gst);
            System.out.println("Final Amount   : " + finalAmount);
            
            System.out.printf("Total bill for %d %s(s): %.2f\n", quantity, coffeeType, finalAmount);
            System.out.println("================================");
        }
        sc.close();

    }
}
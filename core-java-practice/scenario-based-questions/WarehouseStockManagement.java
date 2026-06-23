import java.util.Scanner;

class WarehouseStockManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stock = {50, 20, 80, 20, 60};
        int maxStock = stock[0];
        int minStock = stock[0];
        int totalStock = 0;

        for (int quantity : stock) {
            if (quantity > maxStock) {
                maxStock = quantity;
            }

            if (quantity < minStock) {
                minStock = quantity;
            }

            totalStock += quantity;
        }
        System.out.println("Maximum Stock : " + maxStock);
        System.out.println("Minimum Stock : " + minStock);
        System.out.println("Total Stock   : " + totalStock);

        System.out.println("\nDuplicate Quantities: ");
        boolean duplicateFound = false;
        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    duplicateFound = true;
                }
            }
        }
        if (!duplicateFound) {
            System.out.println("No Duplicates Found");
        }

        System.out.print("\nEnter Rotation Value (k): ");
        int k = sc.nextInt();
        int n = stock.length;
        int[] rotatedStock = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedStock[(i + k) % n] = stock[i];
        }

        System.out.println("\nRotated Stock Array:");
        for (int value : rotatedStock) {
            System.out.print(value + " ");
        }

        int[][] shelfGrid = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("\n\nTransposed Shelf Grid:");

        for (int i = 0; i < shelfGrid[0].length; i++) {
            for (int j = 0; j < shelfGrid.length; j++) {
                System.out.print(shelfGrid[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
import java.util.Scanner;

class ChocolateDistribution {
    public int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter Children: ");
        int children = sc.nextInt();

        ChocolateDistribution obj = new ChocolateDistribution();
        int[] result = obj.distributeChocolates(chocolates, children);

        System.out.println("Each Child Gets = " + result[0]);
        System.out.println("Remaining Chocolates = " + result[1]);

        sc.close();
    }
}
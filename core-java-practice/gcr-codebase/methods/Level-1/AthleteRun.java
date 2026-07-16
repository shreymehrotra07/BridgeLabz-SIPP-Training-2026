import java.util.Scanner;

class AthleteRun {
    public double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;

        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter Side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter Side 3: ");
        double side3 = sc.nextDouble();

        AthleteRun obj = new AthleteRun();
        double rounds = obj.calculateRounds(side1, side2, side3);

        System.out.println("Rounds Required = " + rounds);


        sc.close();
    }
}
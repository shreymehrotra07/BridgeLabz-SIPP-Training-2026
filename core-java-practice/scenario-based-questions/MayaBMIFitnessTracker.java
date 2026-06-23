import java.util.Scanner;

public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter height in meters (or 0 to exit): ");
            double height = sc.nextDouble();

            if (height == 0) {
                break;
            }

            System.out.println("Enter weight in kilograms: ");
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);

            System.out.println("===== BMI REPORT =====");
            System.out.printf("Height : %.2f m%n", height);
            System.out.printf("Weight : %.2f kg%n", weight);
            System.out.printf("BMI    : %.2f%n", bmi);

            if (bmi < 18.5) {
                System.out.println("Category : Underweight");
            } else if (bmi < 25) {
                System.out.println("Category : Normal");
            } else {
                System.out.println("Category : Overweight");
            }

            System.out.println("======================");
        }
        sc.close();
    }
}

import java.util.Scanner;

class BMICalculator {
    public static String[] calculateBMIAndStatus(double weight, double heightInCm) {
        double heightInMeter = heightInCm / 100.0;

        double bmi = weight / (heightInMeter * heightInMeter);

        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        }
        else if (bmi < 25) {
            status = "Normal";
        }
        else if (bmi < 30) {
            status = "Overweight";
        }
        else {
            status = "Obese";
        }

        return new String[] {String.valueOf(bmi), status};
    }

    public static String[][] generateBMIReport(double[][] personData) {
        String[][] report = new String[personData.length][4];

        for (int person = 0;person < personData.length;person++) {
            String[] bmiData = calculateBMIAndStatus(personData[person][0],personData[person][1]);

            report[person][0] = String.valueOf(personData[person][0]);
            report[person][1] = String.valueOf(personData[person][1]);
            report[person][2] = bmiData[0];
            report[person][3] = bmiData[1];
        }
        return report;
    }

    public static void displayReport(String[][] report) {

        System.out.println("\n--------------------------------------------------------------");

        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");

        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {
            System.out.printf( "%-10s %-10s %-10s %-15s%n", report[i][0], report[i][1], report[i][2], report[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPersons = 10;

        double[][] personData = new double[numberOfPersons][2];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");

            personData[i][0] =sc.nextDouble();

            System.out.print("Enter Height (cm): ");

            personData[i][1] = sc.nextDouble();
        }

        String[][] report = generateBMIReport(personData);

        displayReport(report);

        sc.close();
    }
}
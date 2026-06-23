import java.util.Scanner;

class WindChillCalculator {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Wind Speed: ");
        double windSpeed = sc.nextDouble();

        WindChillCalculator obj = new WindChillCalculator();
        double windChill = obj.calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature = " + windChill);

        sc.close();
    }
}
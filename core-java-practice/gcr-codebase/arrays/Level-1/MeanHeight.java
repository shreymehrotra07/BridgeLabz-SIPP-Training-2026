import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter height of 11 players:");

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();

            if (heights[i] <= 0) {
                System.out.println("Invalid Height");
                sc.close();
                return;
            }
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean Height = " + mean);

        sc.close();
    }
}
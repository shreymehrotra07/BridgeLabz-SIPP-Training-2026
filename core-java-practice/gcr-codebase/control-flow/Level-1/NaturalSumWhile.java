import java.util.Scanner;

class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            int sum = 0;
            int counter = 1;

            while (counter <= number) {
                sum += counter;
                counter++;
            }
            int formulaSum = number * (number + 1) / 2;

            System.out.println("While Loop Sum = " + sum);
            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("Results Match = " + (sum == formulaSum));
        }

        sc.close();
    }
}
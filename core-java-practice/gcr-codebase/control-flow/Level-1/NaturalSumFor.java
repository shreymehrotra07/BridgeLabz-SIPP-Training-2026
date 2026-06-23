import java.util.Scanner;

class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        int formulaSum = number * (number + 1) / 2;

        System.out.println("For Loop Sum = " + sum);
        System.out.println("Formula Sum = " + formulaSum);
        System.out.println("Results Match = " + (sum == formulaSum));

        sc.close();
    }
}
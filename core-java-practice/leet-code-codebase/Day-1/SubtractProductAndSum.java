import java.util.Scanner;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = (int) temp % 10;
            product = product * digit;
            temp = temp / 10;
        }
        temp = n;
        while (temp != 0) {
            int digit = (int) temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        int ans = product - sum;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Result = " + subtractProductAndSum(n));

        sc.close();
    }
}
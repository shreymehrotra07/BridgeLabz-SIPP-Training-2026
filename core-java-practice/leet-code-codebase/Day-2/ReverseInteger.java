import java.util.Scanner;

class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;

        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10) {
                System.out.println(0);
                sc.close();
                return;
            }

            if (result < Integer.MIN_VALUE / 10) {
                System.out.println(0);
                sc.close();
                return;
            }

            int remainder = x % 10;
            result = (result * 10) + remainder;
            x = x / 10;
        }

        System.out.println(result);

        sc.close();
    }
}
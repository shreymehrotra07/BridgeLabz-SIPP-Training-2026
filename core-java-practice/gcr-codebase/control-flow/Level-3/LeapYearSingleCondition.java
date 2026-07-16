import java.util.Scanner;

class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeapYear = (year >= 1582) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

        if (isLeapYear) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
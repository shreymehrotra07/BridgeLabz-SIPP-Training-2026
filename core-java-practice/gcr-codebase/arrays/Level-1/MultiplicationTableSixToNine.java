import java.util.Scanner;

class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] results = new int[4];
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            results[index] = number * i;
            index++;
        }
        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i
                    + " = " + results[index]);
            index++;
        }
        sc.close();
    }
}
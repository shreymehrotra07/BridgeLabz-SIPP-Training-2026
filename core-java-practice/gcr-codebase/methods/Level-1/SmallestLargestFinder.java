import java.util.Scanner;

class SmallestLargestFinder {
    public int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();

        SmallestLargestFinder obj = new SmallestLargestFinder();
        int[] result = obj.findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);

        sc.close();
    }
}
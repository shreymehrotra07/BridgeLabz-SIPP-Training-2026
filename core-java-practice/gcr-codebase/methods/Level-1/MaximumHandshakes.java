import java.util.Scanner;

class MaximumHandshakes {
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int numberOfStudents = sc.nextInt();

        MaximumHandshakes obj = new MaximumHandshakes();

        int handshakes = obj.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum Possible Handshakes = " + handshakes);


        sc.close();
    }
}
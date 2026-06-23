import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.println("Enter voter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.println("Choose Candidate: ");
                System.out.println("1. Modi Ji");
                System.out.println("2. Rahul Pappu");
                System.out.println("3. Arvind Keju");

                int vote = sc.nextInt();

                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        System.out.println("Vote recorded for Modi Ji.");
                        break;

                    case 2:
                        candidate2Votes++;
                        System.out.println("Vote recorded for Rahul Pappu.");
                        break;

                    case 3:
                        candidate3Votes++;
                        System.out.println("Vote recorded for Arvind Keju.");
                        break;

                    default:
                        System.out.println("Invalid candidate choice.");
                }
            }
            else {
                System.out.println("Not eligible to vote.");
            }

            System.out.println();
        }

        System.out.println("===== ELECTION RESULT =====");
        System.out.println("Modi Ji Votes : " + candidate1Votes);
        System.out.println("Rahul Pappu Votes : " + candidate2Votes);
        System.out.println("Arvind Keju Votes : " + candidate3Votes);
        System.out.println("===========================");

        sc.close();
    }
    
}

import java.util.Scanner;

class VotingEligibility {
    public static int[] generateAges(int students) {
        int[] ages = new int[students];
        for (int i = 0; i < students; i++) {
            ages[i] = (int)(Math.random() * 50) + 1;
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[] ages = generateAges(students);
        String[][] result = checkEligibility(ages);

        System.out.println("\nAge\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }

        sc.close();
    }
}
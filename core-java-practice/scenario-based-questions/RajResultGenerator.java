import java.util.Scanner;

class RajResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter Marks of 5 Subjects:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        double average = totalMarks / 5.0;

        int gradeCategory;
        if (average >= 90)
            gradeCategory = 1;
        else if (average >= 75)
            gradeCategory = 2;
        else if (average >= 60)
            gradeCategory = 3;
        else if (average >= 40)
            gradeCategory = 4;
        else
            gradeCategory = 5;

        System.out.println("\n========= RESULT =========");
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average     : " + average);

        switch (gradeCategory) {
            case 1:
                System.out.println("Grade : A");
                break;

            case 2:
                System.out.println("Grade : B");
                break;

            case 3:
                System.out.println("Grade : C");
                break;

            case 4:
                System.out.println("Grade : D");
                break;

            default:
                System.out.println("Grade : F");
        }

        sc.close();
    }
}
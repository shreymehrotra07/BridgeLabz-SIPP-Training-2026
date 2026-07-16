import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.print("Physics: ");
            double physics = sc.nextDouble();

            System.out.print("Chemistry: ");
            double chemistry = sc.nextDouble();

            System.out.print("Maths: ");
            double maths = sc.nextDouble();

            percentage[i] = (physics + chemistry + maths) / 3;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Percentage = " + percentage[i]);
            System.out.println("Grade = " + grade[i]);
        }

        sc.close();
    }
}
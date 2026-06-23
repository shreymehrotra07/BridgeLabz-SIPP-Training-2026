import java.util.Scanner;

class StudentGradeReport {
    public static int[][] generateMarks(int numberOfStudents) {
        int[][] marks = new int[numberOfStudents][3];
        for (int student = 0; student < numberOfStudents; student++) {
            for (int subject = 0; subject < 3; subject++) {
                marks[student][subject] = (int)(Math.random() * 90) + 10;
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int student = 0; student < marks.length; student++) {
            int totalMarks = 0;
            for (int subject = 0; subject < 3; subject++) {
                totalMarks += marks[student][subject];
            }
            double averageMarks = totalMarks / 3.0;
            double percentage = totalMarks / 3.0;

            averageMarks = Math.round(averageMarks * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[student][0] = totalMarks;
            result[student][1] = averageMarks;
            result[student][2] = percentage;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];
        for (int student = 0; student < result.length; student++) {
            double percentage = result[student][2];
            if (percentage >= 80) {
                grades[student] = "A";
            }
            else if (percentage >= 70) {
                grades[student] = "B";
            }
            else if (percentage >= 60) {
                grades[student] = "C";
            }
            else if (percentage >= 50) {
                grades[student] = "D";
            }
            else if (percentage >= 40) {
                grades[student] = "E";
            }
            else {
                grades[student] = "R";
            }
        }
        return grades;
    }

    public static void displayScoreCard(int[][] marks, double[][] result, String[] grades) {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");

        System.out.println("-------------------------------------------------------------------------------------");

        for (int student = 0; student < marks.length; student++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-10s%n", student + 1, marks[student][0], marks[student][1], marks[student][2], result[student][0], result[student][1], result[student][2], grades[student]);
        }

        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int[][] studentMarks = generateMarks(numberOfStudents);
        double[][] studentResults = calculateResults(studentMarks);
        String[] studentGrades =calculateGrades(studentResults);

        displayScoreCard(studentMarks, studentResults, studentGrades);

        sc.close();
    }
}
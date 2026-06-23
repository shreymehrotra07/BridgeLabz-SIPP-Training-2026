import java.util.Scanner;

class StringComparison {
    public static boolean compareStrings(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        for (int index = 0; index < firstString.length(); index++) {
            if (firstString.charAt(index) != secondString.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = sc.next();

        System.out.print("Enter second string: ");
        String secondString = sc.next();

        boolean userResult = compareStrings(firstString, secondString);
        boolean builtInResult = firstString.equals(secondString);

        System.out.println("User Defined Result: " + userResult);
        System.out.println("Built-in Result: " + builtInResult);

        sc.close();
    }
}
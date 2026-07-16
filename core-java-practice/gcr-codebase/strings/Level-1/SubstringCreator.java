import java.util.Scanner;

class SubstringCreator {
    public static String createSubstring(String text, int startIndex, int endIndex) {
        String result = "";
        for (int index = startIndex; index < endIndex; index++) {
            result += text.charAt(index);
        }
        return result;
    }

    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int index = 0; index < first.length(); index++) {
            if (first.charAt(index) != second.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int startIndex = sc.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = sc.nextInt();

        String userSubstring = createSubstring(text, startIndex, endIndex);

        String builtInSubstring = text.substring(startIndex, endIndex);

        System.out.println("User Substring: " + userSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);

        System.out.println("Both Same: " + compareStrings(userSubstring, builtInSubstring));

        sc.close();
    }
}
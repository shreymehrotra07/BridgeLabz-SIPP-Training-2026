import java.util.Scanner;

class LowerCaseConverter {
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                currentCharacter = (char)(currentCharacter + 32);
            }
            result += currentCharacter;
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
        String text = sc.nextLine();

        String userLowerCase = convertToLowerCase(text);
        String builtInLowerCase = text.toLowerCase();

        System.out.println("User Result: " + userLowerCase);
        System.out.println("Built-in Result: " + builtInLowerCase);
        System.out.println("Both Same: " + compareStrings(userLowerCase, builtInLowerCase));

        sc.close();
    }
}
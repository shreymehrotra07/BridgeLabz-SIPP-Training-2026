import java.util.Scanner;

class UniqueCharacterFinder {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
            return count;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] temporaryArray = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temporaryArray[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }

        char[] uniqueCharacters = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = temporaryArray[i];
        }
        return uniqueCharacters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.println("\nUnique Characters:");

        for (int i = 0; i < uniqueCharacters.length; i++) {
            System.out.print(uniqueCharacters[i] + " ");
        }

        sc.close();
    }
}
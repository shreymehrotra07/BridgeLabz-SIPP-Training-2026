import java.util.Scanner;

class CharacterFrequencyUsingUnique {
    public static char[] findUniqueCharacters(String text) {
        char[] temporaryArray = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
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

    public static String[][] findFrequency(String text) {
        char[] uniqueCharacters = findUniqueCharacters(text);
        String[][] result = new String[uniqueCharacters.length][2];

        for (int i = 0; i < uniqueCharacters.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (uniqueCharacters[i] == text.charAt(j)) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(uniqueCharacters[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void displayFrequency(String[][] result) {
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] frequencyData = findFrequency(text);

        displayFrequency(frequencyData);

        sc.close();
    }
}
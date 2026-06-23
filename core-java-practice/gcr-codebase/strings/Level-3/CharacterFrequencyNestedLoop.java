import java.util.Scanner;

class CharacterFrequencyNestedLoop {
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            frequency[i] = 1;

            if (characters[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
        }
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];

        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];

                index++;
            }
        }
        return result;
    }

    public static void displayResult(String[] result) {
        System.out.println("\nCharacter Frequencies");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] result = findCharacterFrequency(text);

        displayResult(result);

        sc.close();
    }
}
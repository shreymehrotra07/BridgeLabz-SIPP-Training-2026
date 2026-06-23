import java.util.Scanner;

class CharacterFrequencyASCII {
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int row = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[row][0] = String.valueOf((char) i);
                result[row][1] = String.valueOf(frequency[i]);
                row++;
            }
        }
        return result;
    }

    public static void displayFrequency(String[][] frequencyData) {
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] frequencyData =findCharacterFrequency(text);

        displayFrequency(frequencyData);

        sc.close();
    }
}
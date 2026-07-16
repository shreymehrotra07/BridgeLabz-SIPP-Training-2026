import java.util.Scanner;

class TextSplitter {
    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            }
            else {
                word += text.charAt(i);
            }
        }
        words[index] = word;

        return words;
    }

    public static boolean compareArrays(String[] first, String[] second) {
        if (first.length != second.length)
            return false;

        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Both Same = " + compareArrays(userWords, builtInWords));

        sc.close();
    }
}
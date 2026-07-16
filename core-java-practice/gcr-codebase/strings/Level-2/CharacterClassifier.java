import java.util.Scanner;

class CharacterClassifier {
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) >= 0) return "Vowel";

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nCharacter\tType");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t\t" + checkCharacter(text.charAt(i)));
        }

        sc.close();
    }
}
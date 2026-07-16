import java.util.Scanner;

class VowelConsonantCounter {
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("Vowels = " + result[0]);
        System.out.println("Consonants = " + result[1]);

        sc.close();
    }
}
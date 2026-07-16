import java.util.Scanner;

class AnagramChecker {
    public static boolean checkAnagram(String firstText,String secondText) {
        if (firstText.length() != secondText.length()) {
            return false;
        }
        int[] frequency = new int[256];

        for (int i = 0; i < firstText.length(); i++) {
            frequency[firstText.charAt(i)]++;
            frequency[secondText.charAt(i)]--;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Text: ");
        String firstText =sc.nextLine();

        System.out.print("Enter Second Text: ");
        String secondText =sc.nextLine();

        boolean result = checkAnagram(firstText.toLowerCase(), secondText.toLowerCase());

        if (result) {
            System.out.println("Given Texts are Anagrams");
        }
        else {
            System.out.println("Given Texts are NOT Anagrams");
        }

        sc.close();
    }
}
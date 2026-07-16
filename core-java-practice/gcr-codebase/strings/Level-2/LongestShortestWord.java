import java.util.Scanner;

class LongestShortestWord {
    public static int[] findWords(String[] words) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[shortest].length()) {
                shortest = i;
            }
            if (words[i].length() > words[longest].length()) {
                longest = i;
            }
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        int[] indexes = findWords(words);

        System.out.println("Shortest Word = " + words[indexes[0]]);
        System.out.println("Longest Word = " + words[indexes[1]]);

        sc.close();
    }
}
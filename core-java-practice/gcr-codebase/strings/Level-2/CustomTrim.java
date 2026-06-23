import java.util.Scanner;

class CustomTrim {
    public static String trimText(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ') {
            start++;
        }
        while (text.charAt(end) == ' ') {
            end--;
        }

        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userTrim = trimText(text);
        String builtInTrim = text.trim();

        System.out.println("User Trim = " + userTrim);
        System.out.println("Built-in Trim = " + builtInTrim);

        System.out.println(userTrim.equals(builtInTrim));

        sc.close();
    }
}
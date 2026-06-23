import java.util.Scanner;

class StringLengthFinder {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userLength = findLength(text);

        System.out.println("User Length = " + userLength);
        System.out.println("Built-in Length = " + text.length());

        sc.close();
    }
}
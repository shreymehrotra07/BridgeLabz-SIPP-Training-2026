import java.util.Scanner;

class StringIndexOutOfBoundsDemo {
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Exception Handled: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        handleException(text);

        sc.close();
    }
}
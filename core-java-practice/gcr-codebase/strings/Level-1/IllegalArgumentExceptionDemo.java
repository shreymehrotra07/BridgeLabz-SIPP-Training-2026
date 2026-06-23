import java.util.Scanner;

class IllegalArgumentExceptionDemo {
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        }
        catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException Handled");
        }
        catch (RuntimeException exception) {
            System.out.println("RuntimeException Handled");
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
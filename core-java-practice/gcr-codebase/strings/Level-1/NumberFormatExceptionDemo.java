import java.util.Scanner;

class NumberFormatExceptionDemo {
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);

            System.out.println("Number = " + number);
        }
        catch (NumberFormatException exception) {
            System.out.println("NumberFormatException Handled");
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
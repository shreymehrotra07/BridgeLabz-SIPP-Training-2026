import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception Handled");
        }
        catch (RuntimeException exception) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        handleException(names);

        sc.close();
    }
}
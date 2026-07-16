class NullPointerExceptionDemo {
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        }
        catch (NullPointerException exception) {
            System.out.println("Exception Handled: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
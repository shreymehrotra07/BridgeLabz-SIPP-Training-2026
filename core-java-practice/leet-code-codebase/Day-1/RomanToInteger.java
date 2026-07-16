import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            if (i < s.length() - 1 && curr < value(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        return ans;
    }

    private static int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        System.out.println(roman + " = " + romanToInt(roman));

        sc.close();
    }
}
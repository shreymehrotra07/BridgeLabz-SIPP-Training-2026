import java.util.Scanner;

class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int ans = 0;
        
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = numberOfSteps(num);

        System.out.println(result);

        sc.close();
    }
}
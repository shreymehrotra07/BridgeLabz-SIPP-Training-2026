import java.util.Scanner;

class SpringSeason {
    public boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Day: ");
        int day = sc.nextInt();

        SpringSeason obj = new SpringSeason();

        if (obj.isSpringSeason(month, day)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");

        sc.close();
    }
}
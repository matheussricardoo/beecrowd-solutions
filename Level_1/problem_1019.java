import java.util.Scanner;

public class Problem_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,hours,minutes,seconds;

        n = sc.nextInt();

        hours = n / 3600;
        minutes = (n % 3600) / 60;
        seconds = n % 60;
        
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);
        sc.close();
    }
}

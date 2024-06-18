import java.util.Scanner;

public class Problem_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pair = 0;
        for (int i = 0; i < 5; i++) {
            double n = sc.nextDouble();
            if (n % 2 == 0) {
                pair += 1;
            }
        }
        System.out.printf("%d value pairs \n", pair);
        sc.close();
    }
}

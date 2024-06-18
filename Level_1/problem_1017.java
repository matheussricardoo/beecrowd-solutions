import java.util.Scanner;

public class Problem_1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,gasto_comb;;

        a = sc.nextInt();
        b = sc.nextInt();

        gasto_comb = a * b / 12;

        System.out.printf("%.3f", gasto_comb );
        sc.close();
    }
}

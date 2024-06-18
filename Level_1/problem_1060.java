import java.util.Scanner;

public class Problem_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n >= 0) {
                positivo += 1;
            }
        }
        System.out.printf("%d positive values\n", positivo);
        sc.close();
    }
}

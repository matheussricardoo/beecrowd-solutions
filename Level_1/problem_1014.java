import java.util.Scanner;

public class Problem_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,consumo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        consumo = a / b;
        System.out.printf("%.3f km/l", consumo);
        sc.close();
    }
}

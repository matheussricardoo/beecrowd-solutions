import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> resultados = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int somaImpar = 0;

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }

            for (int num = x + 1; num < y; num++) {
                if (num % 2 != 0) {
                    somaImpar += num;
                }
            }

            resultados.add(somaImpar);
        }

        for (int resultado : resultados) {
            System.out.println(resultado);
        }

        sc.close();
    }
}

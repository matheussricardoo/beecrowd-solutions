import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_1478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> outputs = new ArrayList<>();

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            int[][] matriz = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = Math.abs(i - j) + 1;
                }
            }

            for (int i = 0; i < N; i++) {
                StringBuilder rowString = new StringBuilder();
                for (int j = 0; j < N; j++) {
                    if (j > 0) rowString.append(" ");
                    rowString.append(String.format("%3d", matriz[i][j]));
                }
                outputs.add(rowString.toString());
            }
            outputs.add("");
        }

        for (String output : outputs) {
            System.out.println(output);
        }

        sc.close();
    }
}

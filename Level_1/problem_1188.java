import java.util.Scanner;

public class Problem_1188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op = sc.nextLine().trim();

        double[][] matrix = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        double totalSum = 0.0;
        int count = 0;

        for (int i = 7; i < 12; i++) {
            for (int j = 12 - i; j < i; j++) {
                totalSum += matrix[i][j];
                count++;
            }
        }

        double result = 0.0;
        if (op.equals("S")) {
            result = totalSum;
        } else if (op.equals("M")) {
            result = totalSum / count;
        }

        System.out.printf("%.1f\n", result);
    }
}

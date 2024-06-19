import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> medias = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double media = (x * 2 + y * 3 + z * 5) / 10;
            medias.add(media);
        }

        sc.close();

        for (double media : medias) {
            System.out.printf("%.1f%n", media);
        }
    }
}

import java.util.Scanner;

public class Problem_1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] point1 = sc.nextLine().split(" ");
        double x1 = Double.parseDouble(point1[0]);
        double y1 = Double.parseDouble(point1[1]);

        String[] point2 = sc.nextLine().split(" ");
        double x2 = Double.parseDouble(point2[0]);
        double y2 = Double.parseDouble(point2[1]);

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distancia);
        sc.close();
    }
}

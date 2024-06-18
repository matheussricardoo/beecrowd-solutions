import java.util.Scanner;

public class Problem_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] point1 = sc.nextLine().split(" ");
        double x = Double.parseDouble(point1[0]);
        double y = Double.parseDouble(point1[1]);
        double id;

        if (x == 1){
            id = 4 * y;
            System.out.printf("Total: R$ %.2f%n", id);
        } else if (x == 2) {
            id = 4.50 * y;
            System.out.printf("Total: R$ %.2f%n", id);
        } else if (x == 3) {
            id = 5 * y;
            System.out.printf("Total: R$ %.2f%n", id);
        } else if (x == 4){
            id = 2 * y;
            System.out.printf("Total: R$ %.2f%n", id);
        } else if (x == 5){
            id = 1.50 * y;
            System.out.printf("Total: R$ %.2f%n", id);
        }

        sc.close();
    }
}

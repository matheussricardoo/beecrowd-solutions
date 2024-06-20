import java.util.Scanner;

public class Problem_1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Z = sc.nextInt();

        while (Z <= X) {
            Z = sc.nextInt();
            int count = 1;
            int total = X;

            while (total <= Z) {
                total += X + count;
                count += 1;
            }System.out.println(count);
        }
        sc.close();
    }
}

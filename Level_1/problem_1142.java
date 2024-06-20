import java.util.Scanner;

public class Problem_1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n * 4; i += 4) {
            System.out.println(i + " " + (i + 1) + " " + (i + 2) + " PUM");
        }
    }
}

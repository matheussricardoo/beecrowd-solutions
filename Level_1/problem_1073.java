import java.util.Scanner;

public class Problem_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++){
            if (i % 2 == 0) {
                int dobro = i * i;
                System.out.printf("%d^2 = %d\n",i,dobro);
            }
        }
        sc.close();
    }
}

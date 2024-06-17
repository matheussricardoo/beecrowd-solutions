import java.util.Scanner;

public class Problem_1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,mult;

        a = sc.nextInt();
        b = sc.nextInt();
        mult = a * b;
        System.out.print("PROD = "+  mult);
        sc.close();
    }
}

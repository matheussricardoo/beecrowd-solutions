import java.util.Scanner;

public class Problem_1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,minutos;

        a = sc.nextInt();

        minutos = a * 2;

        System.out.print(minutos + " minutos");
        sc.close();
    }
}

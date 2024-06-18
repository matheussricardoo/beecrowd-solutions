import java.util.Scanner;

public class Problem_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 10 ; i++){
            int multiplicacao = (i + 1) * n;
                    System.out.printf("%d x %d = %d\n",i+1,n,multiplicacao);
            }
        sc.close();
        }
}


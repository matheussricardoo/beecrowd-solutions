import java.util.Scanner;

public class Problem_1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;

        for (int i = x; i <= y; i++){
            if (i % 13 != 0){
                soma += i;
            }
        }
        System.out.print(soma);
    }
}

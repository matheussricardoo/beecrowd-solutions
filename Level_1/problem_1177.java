import java.util.Scanner;

public class Problem_1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] vetor = new int[1000];
        vetor[0] = T;

        for (int i = 0; i< 1000; i++){
            vetor[i] = (i % T);
        }
        for (int i = 0; i< 1000; i++){
            System.out.println(String.format("N[%d] = %d", i, vetor[i]));
        }
    }
}

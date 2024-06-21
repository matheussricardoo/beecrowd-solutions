import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> total_somas = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            if (x % 2 == 0){
                x += 1;
            }
            for (int j = 0; j < y; j++){
                soma += x;
                x += 2;
            }
            total_somas.add(soma);
        }sc.close();
        for (int somas : total_somas){
            System.out.println(somas);
        }
    }
}

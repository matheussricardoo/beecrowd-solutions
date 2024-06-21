import java.util.Scanner;

public class Problem_1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cont_div = 0;
        double sum_div = 0;

        while (true){
            int N = sc.nextInt();
            if (N < 0){
                break;
            }
            sum_div += N;
            cont_div += 1;
        }

        if (cont_div > 0){
            double div = sum_div /cont_div;
            System.out.printf("%.2f",div);
        }
            sc.close();
    }
}

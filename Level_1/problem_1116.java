import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resultado = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            double x = sc.nextInt();
            double y = sc.nextInt();

            if (y == 0){
                resultado.add("divisao impossivel");
            } else{
                double div = x/y;
                resultado.add(String.format("%.1f", div));
            }
        }
        for (String resultados : resultado){
            System.out.println(resultados);
        }
        sc.close();
    }
}

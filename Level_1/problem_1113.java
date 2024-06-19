import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resultado = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == y){
                break;
            }

            if (x < y){
                resultado.add("Crescente");
            }else{
                resultado.add("Decrescente");
            }
        }
        for (String resultados : resultado){
            System.out.println(resultados);
        }
        sc.close();
    }
}

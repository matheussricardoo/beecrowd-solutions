import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resultado = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > 0 && y > 0){
                resultado.add("primeiro");
            } else if (x < 0 && y > 0) {
                resultado.add("segundo");
            } else if (x < 0 && y < 0) {
                resultado.add("terceiro");
            } else if (x > 0 && y < 0){
                resultado.add("quarto");
            } else{
               break;
            }
        }
        for (String resultados : resultado){
            System.out.println(resultados);
        }
        sc.close();
    }
}

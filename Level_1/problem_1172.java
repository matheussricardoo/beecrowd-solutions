import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resultados = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if (n <= 0){
                resultados.add(String.format("X[%d] = 1", i));
            }else{
                resultados.add(String.format("X[%d] = %d", i,n));
            }
        }
        for (String resultado : resultados){
            System.out.println(resultado);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> resultado = new ArrayList<>();
        int senha = 2002;
        while (true) {
            int x = sc.nextInt();

            if (x == senha){
                resultado.add("Acesso Permitido");
                break;
            }else{
                resultado.add("Senha Invalida");
            }
        }
        for (String resultados : resultado){
            System.out.println(resultados);
        }
        sc.close();
    }
}

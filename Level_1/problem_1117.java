import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_1117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> resultados = new ArrayList<>();
        List<Double> notas_validas = new ArrayList<>();

        while (notas_validas.size() < 2) {
            double n = scanner.nextDouble();
            if (n < 0 || n > 10) {
                resultados.add("nota invalida");
            } else {
                notas_validas.add(n);
            }
        }

        double media = (notas_validas.get(0) + notas_validas.get(1)) / 2;
        resultados.add(String.format("media = %.2f", media));

        for (String resultado : resultados) {
            System.out.println(resultado);
        }
        scanner.close();
    }
}

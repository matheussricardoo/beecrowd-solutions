import java.util.Scanner;

public class Problem_1190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char op = sc.next().charAt(0);
        
        double[][] matriz = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        double soma = 0;
        int contagem = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j > i && (i + j) > 11) {
                    soma += matriz[i][j];
                    contagem++;
                }
            }
        }
        
        double resultado;
        if (op == 'S') {
            resultado = soma;
        } else {
            resultado = soma / contagem;
        }
        
        System.out.printf("%.1f\n", resultado);

        sc.close();
    }
}

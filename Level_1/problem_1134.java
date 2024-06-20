import java.util.Scanner;

public class Problem_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma_alcool = 0;
        int soma_gasolina = 0;
        int soma_diesel = 0;

        while (true){
            int n = sc.nextInt();

            if (n == 1){
                soma_alcool +=1;
            } else if (n == 2) {
                soma_gasolina +=1;
            } else if (n == 3) {
                soma_diesel +=1;
            } else if (n == 4) {
                break;
            }
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d",soma_alcool,soma_gasolina,soma_diesel);
    }
}

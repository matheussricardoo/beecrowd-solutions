import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vencedor = "";
        int n = 1;
        int inter = 0;
        int gremio = 0;
        int contador = 0;
        int empate = 0;

        while (true){
            if (n == 1){
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("Novo grenal (1-sim 2-nao)");
                n = sc.nextInt();
                contador += 1;
                if (x > y){
                    inter += 1;
                } else if (y > x) {
                    gremio += 1;
                } else if (x == y) {
                    empate += 1;
                }
            }
            if (n == 2){
                break;
            }
        }sc.close();
        if (inter > gremio){
            vencedor = "Inter venceu mais";
        } else if (gremio > inter) {
            vencedor = "Gremio venceu mais";
        }else{
            vencedor = "Grenal empatado";
        }
        System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n%s",contador,inter,gremio,empate,vencedor);
    }
}

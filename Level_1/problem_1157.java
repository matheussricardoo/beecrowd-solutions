import java.util.Scanner;

public class Problem_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++){
            j +=1;
            if (n % j == 0){
                System.out.println(j);
            }
        }sc.close();
    }
}

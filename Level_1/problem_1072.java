import java.util.Scanner;

public class Problem_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int in_ = 0;
        int out_ = 0;

        for (int i = 0; i < n; i++){
            n = sc.nextInt();
            if (10 <= n && n <= 20){
                in_ +=1;
            } else {
                out_ += 1;
            }
        }
        System.out.printf("%d in\n",in_);
        System.out.printf("%d out",out_);
        sc.close();
    }
}

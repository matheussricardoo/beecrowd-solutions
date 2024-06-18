import java.util.Scanner;

public class Problem_1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pair = 0;
        int odd = 0;
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < 5; i++) {
            double n = sc.nextDouble();
            if (n % 2 == 0) {
                pair += 1;
            } else {
                odd +=1;
            }
            if (n > 0){
                positives +=1;
            }
            if (n < 0){
                negatives +=1;
            }
        }
        System.out.printf("%d even value(s)\n%d odd value(s)\n%d positive value(s)\n%d negative value(s)",pair,odd,positives,negatives);
        sc.close();
    }
}

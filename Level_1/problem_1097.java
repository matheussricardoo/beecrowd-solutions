public class Problem_1097 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 7 + (i - 1); j >= 5 + (i - 1); j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}

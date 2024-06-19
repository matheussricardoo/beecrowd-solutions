public class Problem_1095 {
    public static void main(String[] args) {
       int a = 1;
       for (int i = 60; -5 < i; i -=5 ){
           a += 3;
           System.out.printf("I=%d J=%d\n",a-3,i);
        }
    }
}

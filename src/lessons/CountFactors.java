package lessons;

public class CountFactors {
    public static int solution(int N) {
        int counter = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i * i != N) counter += 2;
                else counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int N = 24;
        System.out.println(solution(N));
    }
}

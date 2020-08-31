public class CountDiv {
    public static int solution(int A, int B, int K) {
        if (A == 0 && B == 0) return 1;

        if (A == B) {
            if (A % K == 0) return 1;
            else return 0;
        }

        if (K == 1) return B - A + 1;

        while (A % K != 0) A++;
        while (B % K != 0) B--;

        return (int) Math.ceil((B - A + 1) / (double) K);
    }

    public static void main(String[] args) {
        int A = 6;
        int B = 11;
        int K = 2;

        System.out.println(solution(A, B, K));
    }
}

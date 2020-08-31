package lessons;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        if (A.length == 2) return Math.abs(A[0] - A[1]);

        int sum1 = A[0];
        int sum2 = 0;

        for (int i = 1; i < A.length; i++)
            sum2 += A[i];

        int min = Math.abs(sum1 - sum2);

        for (int i = 1; i < A.length - 1; i++) {
            sum1 += A[i];
            sum2 -= A[i];

            if (Math.abs(sum1 - sum2) < min)
                min = Math.abs(sum1 - sum2);
        }

        return min;
    }

    public static void main(String[] args) {
        int[] A = {-10, -20, -30, -40, 100};

        System.out.println(solution(A));
    }
}

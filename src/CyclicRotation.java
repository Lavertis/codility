public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        if (A.length == 0)
            return A;

        int[] B = new int[A.length];

        for (int i = 0; i < K; i++) {
            System.arraycopy(A, 0, B, 0, A.length);

            A[0] = B[B.length - 1];

            System.arraycopy(B, 0, A, 1, A.length - 1);
        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] finalA = solution(A, K);

        for (int j : finalA)
            System.out.print(j);
    }
}

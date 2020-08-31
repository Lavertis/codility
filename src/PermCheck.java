import java.util.Arrays;

public class PermCheck {
    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 1 && A[0] != 1) return 0;
        if (A[A.length - 1] != A.length) return 0;

        for (int i = 0; i < A.length - 1; i++)
            if ((A[i]) != (i + 1) || A[i] == A[i + 1])
                return 0;

        return 1;
    }

    public static void main(String[] args) {
        int[] A = {4, 1, 3};
        System.out.println(solution(A));
    }
}

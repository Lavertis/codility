package lessons;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int[] A) {
        if (A.length == 0) return 1;

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++)
            if ((A[i]) != (i + 1))
                return (i + 1);

        return A.length + 1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 1, 5};

        System.out.println(solution(A));
    }
}

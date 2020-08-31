package lessons;

import java.util.Arrays;

public class MissingInteger {
    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 1; i < Integer.MAX_VALUE; i++)
            if (Arrays.binarySearch(A, i) < 0)
                return i;

        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
}

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution(int x, int[] A) {
        if (A.length == 1 && A[0] == x) return 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= x; i++)
            set.add(i);

        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);
            if (set.isEmpty()) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int x = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

        System.out.println(solution(x, A));
    }
}

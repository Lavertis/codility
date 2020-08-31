package lessons;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public static int solution(int[] A) {
        if (A.length == 0) return -1;
        if (A.length == 1) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int max1 = 0;

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
                if (map.get(A[i]) > max) {
                    max = map.get(A[i]);
                    max1 = i;
                }
            } else map.put(A[i], 1);
        }

        if (max > (A.length / 2)) return max1;

        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};

        System.out.println(solution(A));
    }
}

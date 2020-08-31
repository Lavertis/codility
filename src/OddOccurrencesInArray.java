import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : A) {
            if (map.containsKey(j))
                map.put(j, map.get(j) + 1);
            else
                map.put(j, 1);
        }

        for (Map.Entry<Integer, Integer> item : map.entrySet())
            if (item.getValue() % 2 != 0)
                return item.getKey();

        return A[0];
    }

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(solution(A));
    }
}



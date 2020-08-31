public class PassingCars {
    public static int solution(int[] A) {
        long sum = 0;
        int sum1 = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) sum1++;
            else sum += sum1;
        }

        if (sum > 1000000000) return -1;
        else return (int) sum;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};

        System.out.println(solution(A));
    }
}

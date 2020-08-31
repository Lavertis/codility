package lessons;

public class MinPerimeterRectangle {
    public static int solution(int N) {
        int minPerimeter = Integer.MAX_VALUE;

        for (int i = 1; i <= Math.sqrt(N); i++)
            if ((N) % i == 0 && i + ((N) / i) < minPerimeter) minPerimeter = i + ((N) / i);

        return minPerimeter * 2;
    }

    public static void main(String[] args) {
        int N = 30;
        System.out.println(solution(N));
    }
}

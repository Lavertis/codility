public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println(solution(X, Y, D));
    }
}
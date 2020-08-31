public class BinaryGap {

    public static int solution(int N) {
        String binaryN = Integer.toBinaryString(N);
        int numberOf1 = 0;
        int numberOf0 = 0;
        int max = 0;

        for (int i = 0; i < binaryN.length(); i++) {
            int a = Integer.parseInt(binaryN.charAt(i) + "");

            if (a == 1)
                numberOf1++;
            else if (a == 0)
                numberOf0++;
        }

        if (numberOf1 < 2 || numberOf0 == 0) return 0;

        int tempMax;

        for (int i = 0; i < binaryN.length(); i++) {
            tempMax = 0;

            if (Integer.parseInt(binaryN.charAt(i) + "") == 1) {

                for (int j = i + 1; j < binaryN.length(); j++) {
                    int a = Integer.parseInt(binaryN.charAt(j) + "");

                    if (a == 0) {
                        tempMax++;
                    } else if (a == 1) {
                        if (tempMax > max)
                            max = tempMax;
                        break;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int N = 1041;
        System.out.println(solution(N));
    }
}

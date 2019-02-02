package Chapter5;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int[] divisors1 = new int[100];
        for (int i = 1, j = 0; i <= first; i++) {
            if (first % i == 0) {
                divisors1[j] = i;
                j++;
            }
        }
        int[] divisors2 = new int[100];
        for (int i = 1, j = 0; i <= second; i++) {
            if (second % i == 0) {
                divisors2[j] = i;
                j++;
            }
        }
        int greatest = 1;
        for (Integer i : divisors1) {
            for (Integer j : divisors2) {
                if (i.equals(j)) {
                    if (i > greatest) {
                        greatest = i;
                    }
                }
            }
        }
        return greatest;
    }
}

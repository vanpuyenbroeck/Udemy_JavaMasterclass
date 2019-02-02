package Chapter5;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        ArrayList<Integer> divisors1 = getDivisors(first);
        ArrayList<Integer> divisors2 = getDivisors(second);

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

    public static ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}

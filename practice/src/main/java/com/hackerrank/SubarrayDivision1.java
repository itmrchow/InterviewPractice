package com.hackerrank;

import java.util.List;

public class SubarrayDivision1 {
    public static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
            System.out.println(start + "," + i + "," + sum);

            if (start + (m - 1) == i) {
                if (d == sum) {
                    count++;
                }
                sum -= s.get(start);
                start++;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        birthday(List.of(2, 2, 1, 3, 2), 4, 2);
    }
}

package com.hackerrank;

import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> a, List<Integer> b) {
        // Collections.sort(a);
        // Collections.sort(b, Collections.reverseOrder());

        // for (int i = 0; i < a.size(); i++) {
        // if (a.get(i) + b.get(i) < k) {
        // return "NO";
        // }
        // }
        // return "YES";

        var size = a.size();
        var kSum = k * size;
        var aSum = a.stream().reduce(0, (intI, intJ) -> {
            return intI + intJ > k ? k : intJ;
        });
        var bSum = b.stream().reduce(0, (intI, intJ) -> {
            return intI + intJ > k ? k : intJ;
        });
        return kSum <= aSum + bSum ? "NO" : "YES";
    }

    public static void main(String[] args) {
        twoArrays(10, List.of(2, 1, 3), List.of(7, 8, 9));
    }
}

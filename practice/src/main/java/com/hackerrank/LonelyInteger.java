package com.hackerrank;

import java.util.Collections;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {

    }

    public static int lonelyinteger(List<Integer> a) {

        for (Integer i : a) {
            if (Collections.frequency(a, i) == 1)
                return i;
        }
        return -1;

    }
}

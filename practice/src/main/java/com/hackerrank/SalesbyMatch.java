package com.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SalesbyMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();

        for (Integer i : ar) {
            int count = intMap.getOrDefault(i, 0);
            intMap.put(i, ++count);
        }

        int pair = 0;

        for (Entry<Integer, Integer> entry : intMap.entrySet()) {
            pair += entry.getValue() / 2;
        }

        return pair;

    }
}

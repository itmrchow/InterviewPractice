package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SparseArrays {
    /**
     * O(m*n)
     */
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        return queries.stream().map(queryStr -> {
            var count = 0;
            for (String string : strings) {
                if (queryStr.equals(string)) {
                    count++;
                }
            }
            return count;
        }).collect(Collectors.toList());

    }

    /**
     * O(m+n)
     */
    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {

        Map<String, Integer> dic = new HashMap<String, Integer>();
        for(String str: strings){ //O(n)
            int temp = dic.getOrDefault(str,0);
            dic.put(str, ++temp);
        }

        var ans = new ArrayList<Integer>();
        for (String queryStr : queries) {
            ans.add(dic.getOrDefault(queryStr, 0));
        }

        return ans;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("aba", "baba", "aba", "xzxb");
        List<String> queries = List.of("aba",
                "xzxb",
                "ab");
        matchingStrings2(strings, queries);
    }
}

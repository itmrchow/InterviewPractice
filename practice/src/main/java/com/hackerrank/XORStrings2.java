package com.hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class XORStrings2 {
    public static void main(String[] args) {
        String a = "10101";
        String b = "00101";

        System.out.println(stringsXOR(a, b));
    }

    public static String stringsXOR(String s, String t) {

        StringBuilder xor = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            var charA = s.charAt(i);
            var charB = t.charAt(i);

            if (charA == charB) {
                xor.append("0");
            } else {
                xor.append("1");
            }
        }

        return xor.toString();
    }

    public static int findMedian(List<Integer> arr) {

        Collections.sort(arr);
        // Write your code here

        return arr.get(arr.size() / 2);
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int size = matrix.size();
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size / 2; j++) {
                List<Integer> numList = new LinkedList<Integer>();
                numList.add(matrix.get(i).get(j));
                numList.add(matrix.get(i).get(size-j-1));
                numList.add(matrix.get(size-i-1).get(j));
                numList.add(matrix.get(size-i-1).get(size-j-1));

                sum += Collections.max(numList);
            }

        }

        return sum;
    }

    private static void doReverse(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int part1 = 0;
            int part2 = 0;

            for (int p1 = 0; p1 < n / 2; p1++) {
                part1 += list.get(p1);
            }
            for (int p2 = n / 2; p2 < n; p2++) {
                part2 += list.get(p2);
            }

            if (part1 < part2) {
                Collections.reverse(list);
            }
        }
    }

    private static int getSum(List<List<Integer>> matrix) {
        int a = matrix.get(0).get(0);
        int b = matrix.get(0).get(1);
        int c = matrix.get(1).get(0);
        int d = matrix.get(1).get(1);

        return a + b + c + d;
    }

    // public static int sockMerchant(int n, List<Integer> ar) {
        // Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        
        // for (Integer i : ar) {
        //     int count = intMap.getOrDefault(i, 0);
        //     intMap.put(i, ++count);
        // }
        
        // int pair = 0 ;
        
        // for (Entry<Integer,Integer> entry : intMap.entrySet()) {
            
        // }
        

    // }
}

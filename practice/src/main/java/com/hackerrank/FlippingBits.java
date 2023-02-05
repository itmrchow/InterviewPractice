package com.hackerrank;

import java.text.NumberFormat;

public class FlippingBits {
    public static long flippingBits(long n) {

        var binary = String.format("%32s", Long.toBinaryString(n)).replaceAll(" ", "0");
        StringBuilder str = new StringBuilder(binary);
        for (int i = 0; i < binary.length(); i++) {
            var word = binary.charAt(i);
            if ('0' == word) {
                char r = '1';
                word = r;
            } else {
                char r = '0';
                word = r;
            }

            str.setCharAt(i, word);
        }
        return Long.parseLong(str.toString(),2);
    }

    public static void main(String[] args) {
        flippingBits(3);
    }
}

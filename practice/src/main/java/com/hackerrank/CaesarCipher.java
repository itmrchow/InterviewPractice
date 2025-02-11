package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        var indexMap = new HashMap<String, Integer>();
        var wordMap = new HashMap<Integer, String>();
        for (int i = 1; i <= alphabet.length; i++) {
            indexMap.put(alphabet[i - 1] + "", i);
            wordMap.put(i, alphabet[i - 1] + "");
        }

        var strBuilder = new StringBuilder();
        for (char word : s.toCharArray()) {
            boolean isUpperCase = Character.isUpperCase(word);
            word = Character.toLowerCase(word);
            if (!indexMap.containsKey(word + "")) {
                strBuilder.append(word);
            } else {
                var index = indexMap.get(word + "");
                index = index + (k % 26);
                index = index > 26 ? index - 26 : index;
                var newWord = wordMap.get(index);
                strBuilder.append(isUpperCase ? newWord.toUpperCase() : newWord);
            }
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer>[] arr = new ArrayList[10];
        System.out.println(caesarCipher("www.abc.xy", 87));
    }

}

package com.hackerrank;

import java.util.HashSet;

public class Pangrams {
    public static String pangrams(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        
        System.out.println(s);

        var sSet = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {

            sSet.add(s.charAt(i) + "");
        }


        System.out.println(sSet.toString());

        return sSet.size() == 26 ? "pangram" : "not pangram";

    }

    public static void main(String[] args) {
        pangrams("We promptly judged antique ivory buckles for the next prize ");
    }
}

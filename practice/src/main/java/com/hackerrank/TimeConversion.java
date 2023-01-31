package com.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TimeConversion {

    public static String timeConversion(String s) throws ParseException{
        SimpleDateFormat sf12 = new SimpleDateFormat("hh:mm:ssa", Locale.ENGLISH);
        SimpleDateFormat sf24 = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        var time = sf12.parse(s);
        return sf24.format(time);
    }

    public static void main(String[] args) throws Exception{
        var ans = timeConversion("12:40:22AM");
        System.out.println(ans);
    }
}

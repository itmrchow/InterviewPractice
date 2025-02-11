package com.designpattern.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        var list = new ArrayList();
        list.add("aaa");
        list.add(null);
        test(list);
        // String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        // DataSourceDecorator encoded = new CompressionDecorator(
        // new EncryptionDecorator(
        // new FileDataSource("out/OutputDemo.txt")));
        // encoded.writeData(salaryRecords);
        // DataSource plain = new FileDataSource("out/OutputDemo.txt");

        // System.out.println("- Input ----------------");
        // System.out.println(salaryRecords);
        // System.out.println("- Encoded --------------");
        // System.out.println(plain.readData());
        // System.out.println("- Decoded --------------");
        // System.out.println(encoded.readData());
    }

    private static String decition(int status) {
        if (status > 0 && status < 10) {
            return "zero";
        }

        switch (status & 2) {
            case 0:
                return "even";
            case 1:
                return "odd";

            default:
                return "error";
        }
    }

    private static void q2() {
        String str = "5,1,3,4,9,8,6,7,2,0";
        String[] strArray = str.split(",");

        int[] intArray = new int[strArray.length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(intArray);
    }

    private static void q3() {
        Runnable run = new Runnable() {
            public void run() {
                System.out.println("ya");
            }
        };

    }

    public static void test(List<String> params) {
        String result = "";
        for (String param : params) {

            result = result + param + "&";
        }
        System.out.println(result);
    }

    public static void bank() {

        String str = "amount=100.00&bank_code=XYZ808&currency=USD&id=101";

        var bankInfo = new HashMap<String, Object>();

        var keyValues = str.split("&");

        for (String keyValue : keyValues) {
            var info = keyValue.split("=");

            bankInfo.put(info[0], info[1]);
        }

    }

}

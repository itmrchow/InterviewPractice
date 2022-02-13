package com.cakeresumetest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        var t1 = new Task1();

        // a:2 b:4 c:1 d:1
        int count = t1.solution("aaa", new String[] {
                "klk",
                "bbb"
        });

        System.out.println(count);
    }

    int solution(String initialWord, String[] dictionary) {

        int count = 0;
        var initStrInfo = getStringInfo(initialWord);

        for (String dicStr : dictionary) {
            // 長度
            if (initialWord.length() != dicStr.length()) {
                continue;
            }

            // 字個數
            var dicStrInfo = getStringInfo(dicStr);

            var initStrKeySet = initStrInfo.keySet();
            var dicStrKeySet = dicStrInfo.keySet();
            var retainAllSet = new HashSet<String>(initStrKeySet);
            var removeAllSet = new HashSet<String>(initStrKeySet);
            retainAllSet.retainAll(dicStrKeySet);
            removeAllSet.removeAll(dicStrKeySet);

            if (initStrKeySet.size() - 1 == retainAllSet.size()) {

                boolean isAdd = true;
                if (retainAllSet.isEmpty()) {
                    isAdd = initStrKeySet.size() == dicStrKeySet.size();
                } else {

                    for (String retainKey : retainAllSet) {
                        var diff = dicStrInfo.get(retainKey) - initStrInfo.get(retainKey);
                        if (diff != 0) {
                            for (String removeKey : removeAllSet) {
                                if (initStrInfo.get(removeKey).equals(diff)) {

                                    break;
                                } else {
                                    isAdd = false;
                                }
                            }
                            break;
                        }
                    }
                }

                if (isAdd) {
                    System.out.print(dicStr + ":");
                    System.out.print(isAdd + ":");
                    System.out.println(dicStrInfo);
                    count++;
                }
            }

        }
        return count;
    }

    private Map<String, Integer> getStringInfo(String str) {
        Map<String, Integer> info = new HashMap<String, Integer>();

        for (int i = 0; i < str.length(); i++) {
            String subStr = str.substring(i, i + 1);

            int count = info.getOrDefault(subStr, 0);
            info.put(subStr, ++count);
        }

        return info;
    }

}

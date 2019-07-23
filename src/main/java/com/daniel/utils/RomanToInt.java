package com.daniel.utils;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int toInt(String romanString) {
        int result = 0;
        Map<String, Integer> roman = new HashMap<String, Integer>() {
            {
                //基本罗马数字类型
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
                //组合罗马数字类型
                put("IV", 4);
                put("IX", 9);
                put("XL", 40);
                put("XC", 90);
                put("CD", 400);
                put("CM", 900);

            }
        };

        //answer1
        /*int startIndex = 0;
        while (!"".equals(romanString) && romanString.length() > 0) {
            int length = romanString.length();
            if (romanString.length() > 1 && roman.containsKey(romanString.substring(startIndex, startIndex + 2))) {
                result += roman.get(romanString.substring(startIndex, startIndex + 2));
                romanString = romanString.substring(startIndex + 2, length);
            } else {
                result += roman.get(romanString.substring(startIndex, startIndex + 1));
                romanString = romanString.substring(startIndex + 1, length);
            }
        }*/


        //answer2
        int length = romanString.length();
        for (int i = 0; i < length; ) {
            if (i + 1 < length && roman.containsKey(romanString.substring(i, i + 2))) {
                result += roman.get(romanString.substring(i, i + 2));
                i += 2;
            } else {
                result += roman.get(romanString.substring(i, i + 1));
                i += 1;
            }
        }


        return result;
    }


    public static void main(String[] args) {

        RomanToInt romanToInt = new RomanToInt();

        String param = "LVIII";
        int result = romanToInt.toInt(param);

        System.out.printf("the Roman String %s trans to int is %d.\n", param, result);

    }
}

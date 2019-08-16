package com.daniel.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongestCommonPrefix {


    public String commonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }

        String signString = strings[0];
        //anwer1
        //拿第一个匹配,不匹配就从屁股开始切割，直到匹配为止
        /*for (int i = 1; i < strings.length; i++) {
            //index = 0 才代表signString 是 Strings[i] 的前缀。>0代码不是Strings的第一个位置  <0说明没有在strings中找到signString
            while (strings[i].indexOf(signString) != 0) {
                signString = signString.substring(0, signString.length() - 1);
                if (signString.isEmpty()) {
                    return "";
                }
            }
        }*/

        for (int i = 0; i < signString.length(); i++) {
            char charAt = signString.charAt(i);
            for (int j = 1; j < strings.length; j++) {
                int length = strings[j].length();
                char c = strings[j].charAt(i);

                if (i == length || c != charAt) {
                    return signString.substring(0, i);
                }

            }
        }
        return signString;
    }

    public static void main(String[] args) {
        /*LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] StringArrays = new String[]{"daniels", "danialssss", "danialssda"};

        String result = longestCommonPrefix.commonPrefix(StringArrays);
        System.out.printf("The longest common prefix is %s. \n", result);*/

//        Integer x = 3;
//        Integer y = 3;
        // x<y  -1
        // x>y  1
        // x=y  0
        /*System.out.println(x.compareTo(y));*/

       /* BigDecimal a = new BigDecimal(5.00);
        BigDecimal b= new BigDecimal(5.0);
        System.out.println(a.compareTo(b));*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String freceiptRealDate = sdf.format(new Date());
        System.out.println(freceiptRealDate);

    }
}

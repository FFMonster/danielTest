package com.daniel.utils;

public class IsPalindrome {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * <p>
     * 输入 121       121     return true;
     * 输入-121       -121    return flase;
     * 输入10         01      return flase;
     *
     * @param x 整数参数
     * @return boolean
     * @date 2019/7/22 10:40
     */
    public boolean palindrome(int x) {
        if (x < 0) {
            return false;
        }

        int judge = x;
        int reverse = 0;

        while (x != 0) {
            int remainder = x % 10;
            x /= 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse == judge;
    }


    public boolean stringPalindrome(String param) {

        char[] charArray = param.toCharArray();
        int length = charArray.length;
        char[] palindromeCharArray = new char[length];

        int palidromeArraysIndex = 0;
        for (int i = length - 1; i >= 0; i--) {
            palindromeCharArray[palidromeArraysIndex] = charArray[i];
            palidromeArraysIndex++;
        }

        String result = String.valueOf(palindromeCharArray);

        return result.equals(param);
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();

        int x = 123;
        boolean palindrome = isPalindrome.palindrome(x);
        System.out.printf("Int palidrome result is %b. \n", palindrome);

        String y = "888";
        boolean StringPalidrome = isPalindrome.stringPalindrome(y);
        System.out.printf("String palidrome result is %b. \n", StringPalidrome);

    }
}

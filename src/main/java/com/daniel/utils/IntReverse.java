package com.daniel.utils;

public class IntReverse {
    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * <p>
     * input : 123
     * otput : 321
     * <p>
     * input : -123
     * otput : -321
     * <p>
     * input : 120
     * otput : 21
     * <p>
     * <p>
     * 假设我们的环境只能存储得下 32 位的有符号整数，
     * 则其数值范围为 [−2^31, 2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     */
    private int reverse(int x) {
        String y = String.valueOf(x);
        int result;

        try {
            if (y.contains("-")) {
                y = y.replace("-", "");
                result = Integer.valueOf("-" + stringRecerse(y));
            } else {
                result = Integer.valueOf(stringRecerse(y));
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return result;
    }

    private String stringRecerse(String num) {
        char[] numChar = num.toCharArray();

        /*Stack<Object> stack = new Stack<>();
        for (char c : numChar) {
            stack.push(c);
        }

        int size = stack.size();
        char[] resultChar = new char[size];
        for (int i = 0; i < size; i++) {
            resultChar[i] = (char) stack.pop();
        }

        return String.valueOf(resultChar);

        */

        int index = 0;
        char[] result = new char[numChar.length];
        for (int i = numChar.length-1; i >= 0; i--) {
            result[index] = numChar[i];
            index++;
        }

        return String.valueOf(result);
    }


    /**
     * 先求余(个位数)
     * 从十位开始每位都可以根据整除10拿到
    */
    public int reverse2(int x) {
        
        int rev = 0;
        while (x != 0) {
            // 第一轮求个位数 第二轮十位数...
            int pop = x % 10;
            //拿到当前位数后整除10，把当前位数抹除
            x /= 10;

            //2^31-1 = 2147483647  =  2147483640 + 7
            //当rev > 2147483640时 , 代表本轮 *10 一定会 >2^31-1 溢出
            //当rev = 2147483640, 并且 pop > 7 时 , 代表本轮 rev * 10 + pop 一定会 >2^31-1 溢出
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){ return 0;}

            //-2^31 = -2147483648  =  -2147483640 - 8
            //同理如上
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){ return 0;}

            //将上一轮rev*10，空出个位存放当前位数值
            rev = rev * 10 + pop;
        }
        return rev;
    }


    public static void main(String[] args) {
        IntReverse intReverse = new IntReverse();

        int x = 12003;
        int reverse = intReverse.reverse2(x);

        System.out.printf("the result is %d. /n", reverse);
    }
}


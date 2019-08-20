package com.daniel.utils.Exception.RuntimeException;

/*
 *  ArithmeticException  算术运算异常
 *  如 一个整数除以0时，抛出该异常
 * @param null
 * @return
 * @throws
 * @date 2019/8/20 17:40
*/
public class ArithmeticException {
    public static void main(String[] args) {
        Integer num = 100;
        System.out.printf("num is %d, num/0 is %d", num, num / 0);
    }
}

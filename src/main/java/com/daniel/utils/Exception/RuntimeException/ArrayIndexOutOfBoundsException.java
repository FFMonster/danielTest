package com.daniel.utils.Exception.RuntimeException;

import org.apache.log4j.Logger;

/*
 * ArrayIndexOutOfBoundsException   下标越界异常
 * 要获取超出数组长度的对象时，会产生此Exception
 * @param null
 * @return
 * @throws
 * @date 2019/8/20 17:30
 */
public class ArrayIndexOutOfBoundsException {
    private Logger logger = Logger.getLogger(ArrayIndexOutOfBoundsException.class);

    private Integer queryLastElement(Integer[] arr) {
        int length = arr.length;
        if (length < 1) {
            logger.info("array is empty!");
            return 0;
        }
        return arr[length];
    }

    public static void main(String[] args) {

        ArrayIndexOutOfBoundsException test = new ArrayIndexOutOfBoundsException();
        try {
            Integer[] array = {3, 5, 8, 1, 7};
            Integer lastValue = test.queryLastElement(array);
            System.out.printf("the last element is %d", lastValue);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

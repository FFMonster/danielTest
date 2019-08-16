package com.daniel.utils.Thread;

/* 实现创建Thread的三种方式  2.实现 Runnale 接口
 *
 * @return
 * @throws
 * @date 2019/8/16 15:05
 */
public class PrimeRunable implements Runnable {
    private Long minPrime;
    private Integer count = 5;

    PrimeRunable(Long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
        Long maxPrime = minPrime / 3;
        System.out.println(maxPrime);

        System.out.println(Thread.currentThread().getName() + "----------- is running   " + count--);
    }

    public static void main(String[] args) {
        PrimeRunable primeRunable = new PrimeRunable(366L);
        //A  one thread run all round, use One thread : Main
        primeRunable.run();
        primeRunable.run();
        primeRunable.run();
        primeRunable.run();


    }
}

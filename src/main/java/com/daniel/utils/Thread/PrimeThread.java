package com.daniel.utils.Thread;

/* 实现创建Thread的三种方式  1.继承Thread类
 *
 * @return
 * @throws
 * @date 2019/8/16 15:05
 */
public class PrimeThread extends Thread {
    private Long minPrime;
    private Integer count = 5;

    PrimeThread(Long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
        Long maxPrime = minPrime * 2;
        System.out.println(maxPrime);

        System.out.println(Thread.currentThread().getName() + "----------- is running  " + count--);
    }

    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread(200L);
        primeThread.run();
    }
}

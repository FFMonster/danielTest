package com.daniel.utils.Thread;

/* .run() 与 ./start()  的区别
 *
 * @return
 * @throws
 * @date 2019/8/16 15:05
 */
public class RunAndStart implements Runnable {
    private Long minPrime;
    private Integer count = 5;

    RunAndStart(Long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
        Long maxPrime = minPrime / 3;
        System.out.println(maxPrime);

        System.out.println(Thread.currentThread().getName() + "----------- is running   " + count--);
    }

    public static void main(String[] args) {
        PrimeRunable RunAndStart = new PrimeRunable(366L);
        //A  one thread run all round, use One thread : Main
        //.run()方法,直接对RunAndStart 使用,说明run方法是可以   先创建线程，再实际执行线程的
        /*primeRunable.run();
        primeRunable.run();
        primeRunable.run();
        primeRunable.run();*/

        //B four thread run,and sequence not add law
        //start方法,需要先把RunAndStart 作参传入 Thread构造,才能使用。说明 Thread对象才是线程的创建角色。
        //.start()方法将线程启动并初始化，使线程处于 就绪 状态。当CPU调度此线程时，就会进入运行状态，执行 run()方法
        new Thread(RunAndStart).start();
        new Thread(RunAndStart).start();
        new Thread(RunAndStart).start();
        new Thread(RunAndStart).start();


        //总结:
        //.start()方法 是线程的启动者，它可以启动并初始化线程,使线程保持就绪状态
        //.run()方法   是线程的执行者，它是实际执行线程的角色,负责实际运行
    }
}

package com.daniel.utils;

import org.springframework.beans.factory.InitializingBean;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class JobDemo implements InitializingBean {

    public static final String STR = "Mail";
    public static AtomicInteger count = new AtomicInteger(0);
    private static final Long PERIOD_DAY = 1000 * 60 * 60 * 24L;

    public static Map<String, AtomicInteger> map = new ConcurrentHashMap<>();
    static {
        map.put(STR, count);
    }

    public static synchronized void atomicInc(String key){
        if (!map.containsKey(key)){
            return;
        }
        AtomicInteger atomicInteger = map.get(key);
        atomicInteger.incrementAndGet();
        map.put(key, atomicInteger);
    }

    public static synchronized void atomicDec(String key){
        if (!map.containsKey(key)){
            return;
        }
        AtomicInteger atomicInteger = map.get(key);
        atomicInteger.decrementAndGet();
        map.put(key, atomicInteger);
    }

    public static synchronized int atomicGetInt(String key){
        if (!map.containsKey(key)){
            return -1;
        }
        AtomicInteger atomicInteger = map.get(key);
        return atomicInteger.intValue();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 1); //凌晨1点
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date date=calendar.getTime(); //第一次执行定时任务的时间
        //如果第一次执行定时任务的时间 小于当前的时间
        //此时要在 第一次执行定时任务的时间加一天，以便此任务在下个时间点执行。如果不加一天，任务会立即执行。
        if (date.before(new Date())) {
            date = this.addDay(date, 1);
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                init();
            }
        },date,PERIOD_DAY);
    }

    private Date addDay(Date date, int num) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(Calendar.DAY_OF_MONTH, num);
        return startDT.getTime();
    }

    private void init(){
        map.put(STR, new AtomicInteger(0));
    }

}

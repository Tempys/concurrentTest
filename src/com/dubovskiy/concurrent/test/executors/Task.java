package com.dubovskiy.concurrent.test.executors;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by M on 21.01.2017.
 */
public class Task implements Runnable {

    private volatile AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println("counter: "+ counter.getAndIncrement());
    }


}

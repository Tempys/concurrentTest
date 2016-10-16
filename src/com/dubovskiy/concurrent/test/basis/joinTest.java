package com.dubovskiy.concurrent.test.basis;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by M on 26.09.2016.
 */
public class joinTest {

    public static void main(String[] args) throws InterruptedException {
      Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2");
            }
        });

        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("3");
            }
        });


        a.start();
        a.join();
        b.start();
        b.join();
        c.start();
        c.join();

    }
}

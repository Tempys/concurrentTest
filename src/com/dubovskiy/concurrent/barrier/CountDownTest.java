package com.dubovskiy.concurrent.barrier;

import java.util.concurrent.CountDownLatch;

/**
 * Created by M on 15.10.2016.
 */
public class CountDownTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Thread a = new Thread(() ->{


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("start a");
            countDownLatch.countDown();

        });


        Thread b = new Thread(() ->{
            System.out.println("start b");
            countDownLatch.countDown();

        });


        Thread c = new Thread(() ->{
            System.out.println("start c");
            countDownLatch.countDown();

        });

        a.start();
        b.start();
        c.start();

        countDownLatch.await();

        System.out.println("main flow");


    }
}

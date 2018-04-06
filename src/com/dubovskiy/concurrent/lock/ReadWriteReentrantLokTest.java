package com.dubovskiy.concurrent.lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteReentrantLokTest {

    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLockData data = new ReentrantReadWriteLockData();

        Thread a =  new Thread(() ->{

               data.read();

        });

        Thread b =  new Thread(() ->{
           data.read();

        });

        Thread c =  new Thread(() ->{
           data.write();

        });


        a.start();
        b.start();
        c.start();
    }
}

package com.dubovskiy.concurrent.lock;

/**
 * Created by M on 15.10.2016.
 */
public class ReentrantLockBufferTest {
    public static void main(String[] args) {

        ReenrantLockBuffer<Integer> reentrantLockBufferTest = new <Integer>ReenrantLockBuffer(2);

        Thread a =  new Thread(() ->{
            try {
                reentrantLockBufferTest.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread b =  new Thread(() ->{
            try {
                reentrantLockBufferTest.put(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread c =  new Thread(() ->{
            try {
                reentrantLockBufferTest.put(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });


        a.start();
        b.start();
        c.start();




    }
}

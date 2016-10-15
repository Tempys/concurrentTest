package com.dubovskiy.concurrent.test.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by M on 15.10.2016.
 */
public class ReenrantLockBuffer<T> {
    private Lock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();
    private final T[] array;
    private int tail,head,count;

    public ReenrantLockBuffer(int size) {
        this.array = (T[]) new Object[size];
    }


    public void put(T x) throws InterruptedException {

        lock.lock();

        try {

            while (count == array.length){
                notFull.await();
                System.out.println("count"+count);
            }



            array[tail] = x;



            if(++tail == array.length){
                tail =0;
            }

            ++count;
            System.out.println("array"+array.length);
            notEmpty.signal();

        }finally {
            lock.unlock();
        }


    }

    public T get() throws InterruptedException {
        lock.lock();

        try {

            if(count == 0) {
                notEmpty.await();
            }

            T x = array[head];
            array[head] = null;

            if(++head == array.length){
                head=0;
            }

            -- count;
            notFull.signal();

            return x;
        }finally {
            lock.unlock();
        }


    }
}

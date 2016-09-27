package com.dubovskiy.concurrent.test.basis;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by M on 27.09.2016.
 */
public class ReentrantLockTest {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Lock lock1 = new ReentrantLock();


        lock.lock();
        lock1.lock();
        lock1.unlock();
        lock.lock();
        lock1.unlock();


    }
}

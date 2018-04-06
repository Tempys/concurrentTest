package com.dubovskiy.concurrent.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by M on 16.10.2016.
 */
public class ReentrantReadWriteLockData {

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    public void read(){
        lock.readLock().lock();
        System.out.println("read");

    }

    public void write(){
        lock.writeLock().lock();
        System.out.println("write");
    }
}

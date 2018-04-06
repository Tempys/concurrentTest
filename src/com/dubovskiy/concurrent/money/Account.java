package com.dubovskiy.concurrent.money;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by M on 25.12.2016.
 */
public class Account {
    private final int id;
    private long balance;

    public Account(int id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getBalance() {

       return balance;
    }

    public synchronized void debit(long amount){

        this.balance += amount;
    }

    public synchronized void credit(long amount){
        this.balance -= amount;
    }

    public int getId() {
        return id;
    }
}

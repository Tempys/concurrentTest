package com.dubovskiy.concurrent.test.barrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Misha on 31.10.2015.
 */
public class ServiceMan {
    private CyclicBarrier queue;
    private List<String> inQueue;

    public ServiceMan(int hardWorking) {

        inQueue = new ArrayList<String>();
         queue = new CyclicBarrier(hardWorking, new Runnable() {
            @Override
            public void run() {
                System.out.println("Filling " + inQueue);
                inQueue.clear();
            }
        });
    }

    public void recharge(String name) {
        try {
            inQueue.add(name);
            queue.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

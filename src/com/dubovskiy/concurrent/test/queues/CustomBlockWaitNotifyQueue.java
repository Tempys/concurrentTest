package com.dubovskiy.concurrent.test.queues;

import java.util.ArrayList;
import java.util.List;


public class CustomBlockWaitNotifyQueue
{

    private volatile List<String> list = new ArrayList<>();
    private Object putMonitor = new Object();
    private Object getPutMonitor = new Object();


    private void get() throws InterruptedException {
        if(list.isEmpty()){
           getPutMonitor.wait();
        }

    }


    private void put(String item ) throws InterruptedException {
        this.notifyAll();


        if(list.size()>5){
           this.wait();
        }

        list.add(item);
    }
}

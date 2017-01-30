package com.dubovskiy.concurrent.test.queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CustomBlockWaitNotifyQueue
{

    private volatile LinkedList<String> list = new LinkedList<>();
    private Object putMonitor = new Object();
    private Object getPutMonitor = new Object();


    public String get()  {
        if(list.isEmpty()){
            try {
                getPutMonitor.wait();
            } catch (InterruptedException e) {
                //ignore
            }
        }

        String response = list.getLast();

        return response;

    }


    public void put(String item )  {

        if(list.size()>5){
            try {
                putMonitor.wait();
            } catch (InterruptedException e) {
                //ignore
            }
        }

        list.add(item);
        getPutMonitor.notifyAll();
    }
}

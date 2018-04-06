package com.dubovskiy.concurrent.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by M on 19.10.2016.
 */
public class App0 {

    private static AtomicBoolean a = new AtomicBoolean(true);


    public static void main(String[] args) {


        new Thread(()->{

            while (a.get()){
                System.out.println("stop");
            }

        }).start();

        a.set(false);


    }
}

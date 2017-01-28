package com.dubovskiy.concurrent.test.executors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by M on 21.01.2017.
 */
public class ExecutorsShutdowntest {

    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(100);
        Task task = new Task();

        for (int i =0; i<1000;i++){
            executorService.submit(task);
        }

         executorService.shutdown();
      //  System.out.println("number of rejected: "+list);
    }
}

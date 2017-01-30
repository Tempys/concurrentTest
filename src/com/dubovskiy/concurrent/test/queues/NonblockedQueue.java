package com.dubovskiy.concurrent.test.queues;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by M on 28.01.2017.
 */
public class NonblockedQueue {

    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> queue = new ConcurrentLinkedDeque<>();

        queue.add("test");
        queue.getFirst();



    }
}

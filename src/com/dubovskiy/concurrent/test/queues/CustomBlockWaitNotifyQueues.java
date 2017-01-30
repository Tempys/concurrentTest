package com.dubovskiy.concurrent.test.queues;


import java.util.stream.Stream;

public class CustomBlockWaitNotifyQueues {

    public static void main(String[] args) {
        CustomBlockWaitNotifyQueue customBlockWaitNotifyQueue = new CustomBlockWaitNotifyQueue();

        Stream.iterate(0,i->i+1)
               .limit(30)
               .parallel()
                .forEach(i -> customBlockWaitNotifyQueue.put(i+""));

        Stream.iterate(0,i->i+1)
                .limit(30)
                .parallel()
                .forEach(i -> {customBlockWaitNotifyQueue.get();});

    }
}

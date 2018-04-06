package com.dubovskiy.concurrent.synchronizers;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by M on 05.12.2016.
 */
public class SemaphoreAsLimiter {
    private final Semaphore[] ring = new Semaphore[10];
    private final  int maxRatePerSecond;

    public SemaphoreAsLimiter(int maxRatePerSecond) {
        this.maxRatePerSecond = maxRatePerSecond;

        for(int i =0;i < ring.length;i++){
            ring[i] = new Semaphore(maxRatePerSecond);
        }
    }

  /*  public void acquireAccess() {
        while (!aquire()){}
    }*/

/*private boolean aquire(){

        tryToAquire(getActiveRingCell());


}*/

 /*   private boolean tryToAquire(int cell) throws InterruptedException {
        Semaphore semaphore = ring[cell];
     ///   long timeOuts = calculateDelay();

        return semaphore.tryAcquire(timeOuts, TimeUnit.SECONDS);
    }*/

}

package com.dubovskiy.concurrent.test.transfer.money;

/**
 * Created by M on 25.12.2016.
 */
public class TransferMoney {

    public static void main(String[] args) throws InterruptedException {
        Account src = new Account(2,10000);
        Account dest = new Account(1,1000);

        Thread t1 = new Thread(() -> {
            for (int i=1;i<10;i++){
                MoneyTransfer.processTransfer(src,dest,5);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=1;i<10;i++){
                MoneyTransfer.processTransfer(src,dest,7);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("account 1:"+src.getBalance());
        System.out.println("account 2:"+dest.getBalance());
    }

    
}

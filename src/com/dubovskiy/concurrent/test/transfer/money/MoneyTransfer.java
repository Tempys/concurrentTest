package com.dubovskiy.concurrent.test.transfer.money;

/**
 * Created by M on 25.12.2016.
 */
public class MoneyTransfer {

    public   static void processTransfer(Account src,Account dest,long amount){
        src.credit(amount);
        dest.debit(amount);
    }

}

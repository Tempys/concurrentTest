package com.dubovskiy.concurrent.test.barrier;

public class PrinterRecharger {

    public static void main(String[] args) {
        ServiceMan serviceMan = new ServiceMan(3);

        for (int i = 0; i < 15; i++) {
            new Thread(new Printer(serviceMan, "com.dubovskiy.concurrent.test.barrier.Printer" + (i + 1))).start();
        }
    }
}

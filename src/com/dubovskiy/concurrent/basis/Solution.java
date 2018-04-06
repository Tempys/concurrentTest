package com.dubovskiy.concurrent.basis;

/* Синхронизированные методы
Установить модификатор synchronized только тем методам, которым необходимо
*/


public class Solution {

    private double param = Math.random();

    private void method0() {
        double i = method3();
    }

    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

    public void  method2(int param1) {
        param1++;
    }

    double method3() {
        double random = Math.random();
        return random + param;
    }

    private void method4() {
        new StringBuilder().append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        return "Got it!";
    }

    String method7(double param2) {
        return "" + param2;
    }

}
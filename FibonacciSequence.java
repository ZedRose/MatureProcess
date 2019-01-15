package com.company;

public class FibonacciSequence {

    public static void main(String[] args) {
        test1();
        test2();
    }

    //模板
    public static void test1() {
        long a = 0, b = 1;
        long n = 10; //显示的个数
        for (int i = 0; i < n / 2; i++) {
            System.out.println(a + "  " + b + "  ");
            a = a + b;
            b = a + b;
        }
    }

    //自己想
    public static void test2() {
        long a = 0, b = 1;
        System.out.println("第" + 1 + "次计算初始化");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("------------------------");
        for (int i = 2; i <= 10; i++) {
            System.out.println("第" + i + "次计算");
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            System.out.print("a=a+b=");
            a = a + b;
            System.out.println(a+"\na="+a);
            System.out.print("b=a+b=");
            b = a + b;
            System.out.println(b+"\nb="+b);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------------------------");
        }
    }
}

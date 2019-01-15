package com.company;

public class Lessthan100PrimeNumber {


    public static void main(String[] args) {
        sqrt();
    }

    //模板
    public static void test1() {
        for (int i = 0; i < 100; i++) {
            boolean b = true; //默认次数就是素数
            //Math.sprt(i)求出平方根25=5,把判断次数更优化
            for (int j = 2; j <= Math.sqrt(j); j++) {
                if (i % j == 0) {
                    b = false;//次数不是素数
                    break;
                }
            }
            if (b) {
                System.out.println(i + "  ");
            }

        }
    }

    //自己想
    public static void test2() {

    }

    //Math.sqrt用法
    public static void sqrt() {
        for (int i = 0; i < 10; i++) {
            int c = (int) Math.sqrt(i);
            System.out.println(c);
        }
    }
}

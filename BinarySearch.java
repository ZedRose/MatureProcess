package com.company;

/**
 * 二分查找
 */
public class BinarySearch {

    //数字版
    public static void number() throws InterruptedException {
        int ran = (int) Math.floor(Math.random() * 10000000 + 1);

        //中间
        int cen = 5000000;

        //左边
        int left = 1;

        //右边
        int right = 10000000;


        //false==找到了
        boolean flag = true;

        //查找的次数
        int count = 0;

        while (flag) {
            count++;
            System.out.println("----------当前为第" + count + "次查找----------");
            System.out.println("需要查找的数：" + ran);
            if (cen > ran) {
                //右边的数=中间数-1
                right = cen - 1;
                System.out.println("大了");
            } else if (cen < ran) {
                //左边的数=中间数+1
                left = cen + 1;
                System.out.println("小了");
            } else if (cen == ran) {
                System.out.println("找到了");
                flag = false;
            }
            if (left == ran) {
                System.out.println("找到了");
                flag = false;
            } else if (right == ran) {
                System.out.println("找到了");
                flag = false;
            }
            cen = (left + right) / 2;
            System.out.println("左边：" + left + "  中间：" + cen + "  右边：" + right);
            Thread.sleep(1000);

        }
    }

    //数组版
    public static void array() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static void main(String[] args) {
        try {
            number();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

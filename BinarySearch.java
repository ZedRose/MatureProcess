package com.company;

/**
 * 二分查找
 */
public class BinarySearch {

    //数字版
    public static void number() throws InterruptedException {

        int num = 1000;

        int ran = (int) Math.floor(Math.random() * num + 1);

        int cen = num / 2;

        int left = 1;

        int right = num;


        boolean flag = true;

        int count = 0;
        System.out.println("需要找的数：" + ran);
        while (true) {
            count++;
            System.out.println("----------正在进行第" + count + "次查找----------");
            if (left == ran) {
                cen = left;
            } else if (right == ran) {
                cen = right;
            }
            if (cen > ran) {
                right = cen - 1;
            } else if (cen < ran) {
                left = cen + 1;
            } else if (cen == ran) {
                System.out.println("找到了");
                flag = false;
            }
            cen = (left + right) / 2;
            if (flag == false) {
                break;
            }
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

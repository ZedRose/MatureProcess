package com.company.Sort;

/**
 * 排序
 */
public class Sort implements Runnable {

    private String num;

    public Sort(int num) {
        this.num = num + "";
    }

    public static void main(String[] args) {


        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.floor(Math.random() * 100);
        }
        System.out.println("排序前：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print((nums[i] + "\t"));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("排序后：");
        for (int i = 0; i < nums.length; i++) {
            new Thread(new Sort(nums[i])).start();
        }
    }

    public void run() {
        try {
            Thread.sleep(Integer.valueOf(num));
            System.out.print(num + "\t");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

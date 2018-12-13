package Examination;

import java.util.Scanner;

/**
 * 数字分割练习
 * 如88888,分割为88,888
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String nums = input.next();
        StringBuffer str = new StringBuffer(nums);
        for (int i = nums.length(); i > 0; i = i - 3) {
            if (i > 3) {
                str.insert(i = i - 3, ',');
            }
            System.out.println(str);
        }
    }
}

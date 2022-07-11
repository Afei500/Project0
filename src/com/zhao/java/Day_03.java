package com.zhao.java;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhao
 * Date: 2022-07-10
 * Time: 17:40
 */
//p74
public class Day_03 {
    public static void main(String[] args) {
        int num=125;
        System.out.println("个位数是"+num%10);
        System.out.println("十位数是"+num%100/10);
        System.out.println("百位数是"+num/100);
        /*&和&&异同
        * 都是逻辑与
        * 但是&&会有短路问题，&就没有短路问题
        * */

    }
}

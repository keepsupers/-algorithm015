package week1.day1;

/**
 * @author : haozhang
 * @date : Created in  2020-08-24
 * @description :爬楼梯
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * https://leetcode-cn.com/problems/climbing-stairs/
 * </p>
 * @modified By：
 * @version: 1.0
 */
public class ClimbStairs {

    public static void main(String[] args) {
//        System.out.println(climbStairs(3));
//        System.out.println(climbStairs2(2));
        System.out.println(climbStairs3(10));
        System.out.println(climbStairs4(10));
    }


    public static int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] temp = new int[n + 1];
        temp[0] = 1;
        temp[1] = 1;
        for (int i = 2; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }


        return temp[n];
    }

    public static int climbStairs2(int n) {
        int a = 1;
        int b = 1;
        while (n-- > 0) {
            a = (b += a) - a;
        }
        return a;
    }

    public static int climbStairs3(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        int pre1 = 1;
        int pre2 = 2;
        int current = 0;
        int i = 3;
        while (i <= n) {
            current = pre1 + pre2;
            pre1 = pre2;
            pre2 = current;
            i++;
        }
        return current;
    }

    public static int climbStairs4(int n) {
        if (n <= 2) {
            return n;
        }
        int result = 0, pre1 = 1, pre2 = 1;
        for (int i = 1; i < n; i++) {
            result = pre1 + pre2;
            pre1 = pre2;
            pre2 = result;
        }
        return result;
    }

}

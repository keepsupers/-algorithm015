package week1.day1;

/**
 * @author : haozhang
 * @date : Created in  2020-08-28
 * @description :两个数之和
 * <p>
 * https://leetcode-cn.com/problems/two-sum/
 * </p>
 * @modified By：
 * @version: 1.0
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] sourece = new int[]{1, 2, 3};
        int target = 3;
        int[] result = twoSum(sourece, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] twoSum(int[] source, int target) {

        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[j] + source[i] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("no correct result");

    }
}
